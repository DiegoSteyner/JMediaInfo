package jvideoinfo.controller;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jutil.utils.RuntimeUtils;
import jutil.utils.SystemUtils;
import jvideoinfo.model.InfoAudio;
import jvideoinfo.model.InfoGeral;
import jvideoinfo.model.InfoLegend;
import jvideoinfo.model.InfoMedia;
import jvideoinfo.model.InfoVideo;
import jvideoinfo.utils.CheckFiles;

/**
 * Classe que recebe e trata a requisição de execução para coleta de informação do mediaInfo
 * 
 * @author Diego Steyner
 */
public class MediaInfoController {
	
	private String mediaInfoUrl;
	private String videoFileUrl;
	
    private static final String CONF_REGEX                 = "(?imx)";
    private static final String REGEX_EXTRACT_TITLES       = "^(Ge|Vi|Au|Te|Men).*";
    private static final String REGEX_EXTRACT_TITLE_GERAL  = "^(Ge).*";
    private static final String REGEX_EXTRACT_TITLE_VIDEO  = "^(Vi).*";
    private static final String REGEX_EXTRACT_TITLE_AUDIO  = "^(Au).*";
    private static final String REGEX_EXTRACT_TITLE_LEGEND = "^(Te).*";
    private static final String REGEX_EXTRACT_LINES        = "^[a-z].*\\s";
    private static final String REGEX_SPLIT_LINE           = "\\s{5}\\B:\\s{1}";

    /**
     * Construtor parametrizado
     * 
     * @param mediaInfoUrl O endereço da pasta ou do arquivo mediaInfo.exe
     * @param videoFileUrl O endereço completo do vídeo que se deseja obter as informações
     * 
     * @throws Exception Caso ocorra algum erro uma exceção será lançada
     */
	public MediaInfoController(String mediaInfoUrl, String videoFileUrl) throws Exception 
	{
		super();
		this.mediaInfoUrl = mediaInfoUrl;
		this.videoFileUrl = videoFileUrl;
		
		if(new File(mediaInfoUrl).isDirectory())
		{
		    configureMediaInfo();
		}
	}

	/**
	 * Método que configura o endereço do mediaInfo caso tenha sido passado somente a pasta
	 * 
	 * @throws Exception Caso ocorra algum erro uma exceção será lançada
	 */
	private void configureMediaInfo() throws Exception
    {
        File temp = new File(this.mediaInfoUrl, CheckFiles.FILE_NAME_MEDIA_INFO_EXE);
        
        if(temp.exists() && temp.isFile())
        {
            this.mediaInfoUrl = temp.getAbsolutePath();
        }
        else
        {
            throw new Exception("Não foram encontrados os arquivos do MediaInfo no diretório informado");
        }
    }

	/**
	 * Método que executa o mediaInfo e faz o parse das informações retornadas
	 * 
	 * @return O {@link InfoMedia} com as informações coletadas
	 * @throws Exception Caso ocorra algum erro uma exceção será lançada
	 */
    public InfoMedia getInfoMedia() throws Exception
	{
		InfoMedia infoMedia = new InfoMedia();
		String infoGeral = RuntimeUtils.execProgramByCommand(this.mediaInfoUrl, this.videoFileUrl, System.getProperty(SystemUtils.VM_PROPERTIES_TEMP_DIR), null, "UTF-8");
		String temp1 = "";
		String temp2[];
		
		Matcher mlinhas = Pattern.compile(CONF_REGEX+REGEX_EXTRACT_LINES).matcher(infoGeral);
		
		while(mlinhas.find())
		{
			temp1 = "";
			
			if(Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLE_GERAL).matcher(mlinhas.group()).find())
			{
				Matcher mgeral = Pattern.compile(CONF_REGEX+REGEX_EXTRACT_LINES).matcher(infoGeral.substring(mlinhas.end(), infoGeral.length()));
				
				if(mgeral.find())
				{
					infoMedia.addInfoGeral(new InfoGeral());
					
					String shorName = new File(this.videoFileUrl).getName();
					shorName = shorName.substring(0, shorName.lastIndexOf('.'));
					
					infoMedia.getInfoGeral().getFirst().getInfoGeral().put("short file name", shorName);
					
					temp1 = temp1.concat(infoGeral).substring(mlinhas.start(), mlinhas.end()).trim().concat("\n");
                    temp1 = temp1.concat("short file name                          : ").concat(shorName).concat("\n");
					
					do 
					{
						if(!Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLES).matcher(mgeral.group()).find())
						{
							temp1 = temp1.concat(mgeral.group().trim()).concat("\n");
							temp2 = mgeral.group().trim().split(CONF_REGEX+REGEX_SPLIT_LINE);
							
							infoMedia.getInfoGeral().getFirst().getInfoGeral().put(temp2[0].trim().toLowerCase(), temp2[1]);
						}
						else 
						{
							break;
						}
						
					}while(mgeral.find());
					
					infoMedia.getInfoGeral().getFirst().setRawData(temp1);
				}
			}

			if(Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLE_VIDEO).matcher(mlinhas.group()).find())
			{
				Matcher mgeral = Pattern.compile(CONF_REGEX+REGEX_EXTRACT_LINES).matcher(infoGeral.substring(mlinhas.end(), infoGeral.length()));
				
				if(mgeral.find())
				{
					infoMedia.addInfoVideo(new InfoVideo());
					temp1 = temp1.concat(infoGeral).substring(mlinhas.start(), mlinhas.end()).trim().concat("\n");
					
					do 
					{
						if(!Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLES).matcher(mgeral.group()).find())
						{
							temp1 = temp1.concat(mgeral.group().trim()).concat("\n");
							temp2 = mgeral.group().trim().split(CONF_REGEX+REGEX_SPLIT_LINE);
							
							infoMedia.getInfoVideo().getLast().getInfoVideo().put(temp2[0].trim().toLowerCase(), temp2[1]);
						}
						else 
						{
							break;
						}
						
					}while(mgeral.find());
					
					infoMedia.getInfoVideo().getLast().setRawData(temp1);
				}
			}
			
			if(Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLE_AUDIO).matcher(mlinhas.group()).find())
			{
				Matcher mgeral = Pattern.compile(CONF_REGEX+REGEX_EXTRACT_LINES).matcher(infoGeral.substring(mlinhas.end(), infoGeral.length()));
				
				if(mgeral.find())
				{
					infoMedia.addInfoAudio(new InfoAudio());
					temp1 = temp1.concat(infoGeral).substring(mlinhas.start(), mlinhas.end()).trim().concat("\n");
					
					do 
					{
						if(!Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLES).matcher(mgeral.group()).find())
						{
							temp1 = temp1.concat(mgeral.group().trim()).concat("\n");
							temp2 = mgeral.group().trim().split(CONF_REGEX+REGEX_SPLIT_LINE);
							
							infoMedia.getInfoAudio().getLast().getInfoAudio().put(temp2[0].trim().toLowerCase(), temp2[1]);
						}
						else 
						{
							break;
						}
						
					}while(mgeral.find());
					
					infoMedia.getInfoAudio().getLast().setRawData(temp1);
				}
			}
			
			if(Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLE_LEGEND).matcher(mlinhas.group()).find())
			{
				Matcher mgeral = Pattern.compile(CONF_REGEX+REGEX_EXTRACT_LINES).matcher(infoGeral.substring(mlinhas.end(), infoGeral.length()));
				
				if(mgeral.find())
				{
					infoMedia.addInfoLegend(new InfoLegend());
					temp1 = temp1.concat(infoGeral).substring(mlinhas.start(), mlinhas.end()).trim().concat("\n");
					
					do 
					{
						if(!Pattern.compile(CONF_REGEX+REGEX_EXTRACT_TITLES).matcher(mgeral.group()).find())
						{
							temp1 = temp1.concat(mgeral.group().trim()).concat("\n");
							temp2 = mgeral.group().trim().split(CONF_REGEX+REGEX_SPLIT_LINE);
							
							infoMedia.getInfoLegend().getLast().getInfoLegend().put(temp2[0].trim().toLowerCase(), temp2[1]);
						}
						else 
						{
							break;
						}
						
					}while(mgeral.find());
					
					infoMedia.getInfoLegend().getLast().setRawData(temp1);
				}
			}
			
		}
		
		infoMedia.setRawData(infoGeral);
		return(infoMedia);
		
	}
	
}
