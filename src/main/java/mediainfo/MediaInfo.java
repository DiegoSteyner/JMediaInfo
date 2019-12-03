package mediainfo;

import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import jutil.data.enums.RegexEnum;
import jutil.utils.RuntimeUtils;
import mediainfo.data.dto.AudioDTO;
import mediainfo.data.dto.GeralDTO;
import mediainfo.data.dto.LegendaDTO;
import mediainfo.data.dto.MediaDTO;
import mediainfo.data.dto.MediaInfoDTO;
import mediainfo.data.dto.VideoDTO;
import mediainfo.data.enums.MediaInfoParameters;
import mediainfo.data.enums.MediaInfoSections;

/**
 * Classe criada para se comunicar com o mediaInfo e executar a transformação dos retornos em objetos 
 * 
 * @author Diego Steyner
 */
public final class MediaInfo 
{
	private String mediaInfoExe;
	private String videoFile;

	/**
	 * Construtor privado
	 */
	private MediaInfo() 
	{
	}

	/**
	 * Método que cria uma instancia nova para execução de vídeo.
	 * 
	 * @param mediaInfoExe O endereço do mediaInfo.exe
	 * @param videoFile O endereço do vídeo.
	 * 
	 * @return O objeto {@link MediaInfo} criado.
	 */
	public static MediaInfo getNewInstance(String mediaInfoExe, String videoFile) 
	{
		MediaInfo media = new MediaInfo();

		if(mediaInfoExe.contains("\""))
		{
			media.mediaInfoExe = mediaInfoExe;
		}
		else 
		{
			media.mediaInfoExe = "\""+mediaInfoExe+"\"";
		}

		if(mediaInfoExe.contains("\""))
		{
			media.videoFile = videoFile;
		}
		else 
		{
			media.videoFile = "\""+videoFile+"\"";
		}
		
		return(media);
	}

	/**
	 * Lê as informações do vídeo e retornam como uma String XML formatada 
	 * 
	 * @return A String XML formatafa
	 * @throws Exception Caso algum erro ocorra, uma exceção sera lançada.
	 */
	public String getInfoAsXml() throws Exception
	{
		String json = RuntimeUtils.execSystemCommand(mediaInfoExe+" "+videoFile+" --Output=XML", null, "UTF-8");
		
		return(json);
	}
	
	/**
	 * Método que retorna as informações do vídeo como um {@link MediaInfoDTO}
	 * 
	 * @return O objeto {@link MediaInfoDTO} criado
	 * @throws Exception Caso algum erro ocorra, uma exceção sera lançada.
	 */
	public MediaInfoDTO getInfoAsDTO() throws Exception
	{
		MediaInfoDTO retorno = new MediaInfoDTO(new ArrayList<VideoDTO>(), new ArrayList<AudioDTO>(), new ArrayList<LegendaDTO>());
		
		String xml = RuntimeUtils.execSystemCommandCmd(mediaInfoExe+" "+videoFile+" --Output=XML", null, "UTF-8");

		SAXReader reader = new SAXReader();
        Document document = reader.read(new StringReader(xml));
        
        String xmlPart = createXpath(MediaInfoSections.SECTION_GERAL.getSectionName()).selectNodes(document).get(0).asXML();
		GeralDTO geral = (GeralDTO) JAXBContext.newInstance(GeralDTO.class).createUnmarshaller().unmarshal(new StringReader(xmlPart.replace("xmlns", "nonamespace")));
        
		File file = new File(videoFile.replace("\"", ""));
		geral.setFilePath(file.getAbsolutePath());
		geral.setSimpleFileName(file.getName().replaceAll(RegexEnum.FIND_FILE_EXTENSION.getStringValue(), ""));
		geral.setCompleteFileName(file.getName());
		
        retorno.setInformacoesGerais(geral);
        
        retorno.getAudios().addAll(createList(AudioDTO.class, MediaInfoSections.SECTION_AUDIO.getSectionName(), document));
        retorno.getVideos().addAll(createList(VideoDTO.class, MediaInfoSections.SECTION_VIDEO.getSectionName(), document));
        retorno.getLegendas().addAll(createList(LegendaDTO.class, MediaInfoSections.SECTION_TEXT.getSectionName(), document));
        
		return(retorno);
	}
	
	/**
	 * Metodo que recupera o valor de um parameter através do mediaInfo
	 * 
	 * @param parameter O {@link MediaInfoParameters} desejado
	 * 
	 * @return O Valor do parametro retornado pelo mediaInfo
	 * @throws Exception Caso algum erro ocorra, uma exceção sera lançada.
	 */
	public String getInfoForParameter(MediaInfoParameters parameter) throws Exception
	{
		return(RuntimeUtils.execSystemCommand(mediaInfoExe+" "+videoFile+" --Inform="+parameter.getSectionName()+";%"+parameter.getPropertieName()+"%;", null, "UTF-8"));
	}

	/**
	 * Método que extrai os nós do XML junto com os seus valores
	 * 
	 * @param <T> O tipo do objeto a ser extraído
	 * @param clazz O tipo da Class do objeto 
	 * @param section A seção do XML que se deseja extrair
	 * @param document O XML completo
	 * 
	 * @return Uma {@link List} do tipo do objeto informado
	 * @throws JAXBException Caso ocorra algum erro no parse, leitura ou a estrutura do XML seja inválida, um erro será retornado
	 */
	@SuppressWarnings("unchecked")
	private <T extends MediaDTO> List<T> createList(Class<T> clazz, String section, Document document) throws JAXBException 
	{
		String xmlPart;
		List<Node> audios = createXpath(section).selectNodes(document);
		List<T> lista = new ArrayList<T>();
		
		for (int i = 0; i < audios.size(); i++) 
		{
			xmlPart = audios.get(i).asXML();
			
			lista.add(((T)JAXBContext.newInstance(clazz).createUnmarshaller().unmarshal(new StringReader(xmlPart.replace("xmlns", "nonamespace")))));
		}
		
		return(lista);
	}

	/**
	 * Método que cria um xPath pesquisável à partir do nó informado
	 * 
	 * @param sectionName O nome do nó para o qual o xPath deve ser criado
	 * @return O xPath criado.
	 */
	private XPath createXpath(String sectionName) 
	{
		Map<String, String> namespaceUris = new HashMap<String, String>();
        namespaceUris.put("xmlns", "https://mediaarea.net/mediainfo");
        
		XPath xPath = DocumentHelper.createXPath("//xmlns:track[@type='"+sectionName+"']");
        xPath.setNamespaceURIs(namespaceUris);
        
		return xPath;
	}
}
