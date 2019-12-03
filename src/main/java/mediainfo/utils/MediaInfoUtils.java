package mediainfo.utils;

import java.util.Locale;

import jutil.utils.StringUtils;
import mediainfo.data.dto.AudioDTO;
import mediainfo.data.dto.LegendaDTO;
import mediainfo.data.dto.MediaDTO;
import mediainfo.data.dto.VideoDTO;

public final class MediaInfoUtils 
{
	private MediaInfoUtils() 
	{
		throw new UnsupportedOperationException("A classe não pode ser instanciada");
	}
	
	/**
	 * Método que formata o audio para o padrão hh:MM:ss
	 * 
	 * @param duration A duração em milissegundos
	 * 
	 * @return A String formatada
	 */
	public static String formatDuration(String duration) 
	{
		int ms = Integer.parseInt(duration.replace(".", ""));
		long segundos = (ms / 1000) % 60;
		long minutos = (ms / 60000) % 60; // 60000 = 60 * 1000
		long horas = ms / 3600000; // 3600000 = 60 * 60 * 1000
		
		return String.format("%02dh:%02dm:%02ds", horas, minutos, segundos);
	}
	
	/**
	 * Método que retorna o nome da linguagem selecionada
	 * 
	 * @param media O {@link AudioDTO} ou {@link LegendaDTO} da midia.
	 * 
	 * @return O nome da linguagem
	 * @throws Exception Caso algum erro ocorra, uma exceção sera lançada.
	 */
	public static String formatLanguage(MediaDTO media) throws Exception
	{
		if(media instanceof AudioDTO)
		{
			return (getLanguage(((AudioDTO)media).getLanguage()));
		}
		else if(media instanceof LegendaDTO)
		{
			return (getLanguage(((LegendaDTO)media).getLanguage()));
		}
		else
		{
			throw new Exception("A classe "+media.getClass()+" não é suportada para essa operação");
		}
	}

	/**
	 * Método que testa e formata a String
	 * 
	 * @param str A String da linguagem
	 * 
	 * @return A String formatada
	 * @throws Exception Caso algum erro ocorra, uma exceção sera lançada.
	 */
	private static String getLanguage(String str) throws Exception 
	{
		if(StringUtils.isNotNullOrEmptyTrim(str) && str.length() >= 2)
		{
			return(StringUtils.capitalizeToCamelCase(new Locale(str).getDisplayName()));
		}
		else
		{
			return("");
		}
	}

	/**
	 * Método que formata um audio para o padrão de comercial
	 * 
	 * @param audio O {@link AudioDTO} a ser formatado
	 * 
	 * @return A String formatada no padrão comercial do audio
	 * @throws Exception Caso algum erro ocorra, uma exceção sera lançada.
	 */
	public static String formatAudio(AudioDTO audio) throws Exception
	{
		StringBuilder str = new StringBuilder();
		
		if(StringUtils.isNotNullOrEmptyTrim(audio.getFormat_Commercial_IfAny()))
		{
			
			str.append(audio.getFormat());
			str.append(" (").append(audio.getFormat_Commercial_IfAny()).append(" ").append(audio.getChannels()).append(".1").append(")");
		}
		else
		{
			str.append(audio.getFormat());
			str.append(" ").append(audio.getChannels()).append(".1");
		}
		
		return(str.toString());
	}
	
	/**
	 * Método que formata a resolução do vídeo para um padrão comercial
	 * 
	 * @param video O {@link VideoDTO} a ser formatado
	 * @return A String formatada no padrão de mercado
	 */
	public static String formatResolution(VideoDTO video)
	{
		return(video.getWidth()+" x "+video.getHeight());
	}
}
