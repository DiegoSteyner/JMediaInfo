package mediainfo;

import mediainfo.data.dto.MediaInfoDTO;
import mediainfo.data.enums.MediaInfoParameters;
import mediainfo.utils.MediaInfoUtils;

public class PrincipalMediaInfo {

	public static final String MEDIA_INFO_EXE = "D:\\Desenvolvimento\\CLI\\MediaInfo CLI x64 v19.07\\MediaInfo.exe";

	public static void main(String[] args) 
	{
		try 
		{
			MediaInfo mediaInfo = MediaInfo.getNewInstance(MEDIA_INFO_EXE, "D:\\teste\\01365.00 [Filme] -  A teoria de tudo.mkv");
			MediaInfoDTO dto = mediaInfo.getInfoAsDTO();

			System.out.println(dto.getLegendas().size());
			System.out.println(dto.getAudios().get(0).getLanguage());
			System.out.println(MediaInfoUtils.formatDuration(dto.getInformacoesGerais().getDuration()));
			System.out.println(mediaInfo.getInfoForParameter(MediaInfoParameters.GENERAL_FILE_SIZE_CONVERTED));

			System.exit(0);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
