package jvideoinfo.test;

import org.junit.Before;
import org.junit.Test;

import jvideoinfo.controller.MediaInfoController;
import jvideoinfo.model.InfoMedia;

public class MediaControllerTest 
{
	private InfoMedia info;
	public static String mediaInfoUrl = "G:\\Downloads\\MediaInfo\\MediaInfo.exe";
    public static String videoFileUrl = "G:\\Prontos\\Séries\\Supernatural\\1ª Temporada\\Episódio 02 – Wendigo.mkv";
	
	@Test
	public void getMediaController()
	{
		try 
		{
		    System.out.println(info.getInfoGeral().getFirst().getRawData());
			
			if(!info.getInfoAudio().isEmpty())
			{
				System.out.println(info.getInfoAudio().get(0).getRawData());
			}
			if(!info.getInfoVideo().isEmpty())
			{
				System.out.println(info.getInfoVideo().get(0).getRawData());
			}
			if(!info.getInfoLegend().isEmpty())
			{
				System.out.println(info.getInfoLegend().get(0).getRawData());
			}
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace();
		}
	}
	
	@Before
	public void getInfoMedia()
	{
		try 
		{
            info = new MediaInfoController(mediaInfoUrl, videoFileUrl).getInfoMedia();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
