package jvideoinfo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import jvideoinfo.test.MediaControllerTest;

public class PrincipalJMediaInfo 
{
    /**
     * Classe principal
     * 
     * @param args Os argumentos sendo: args[0] = Endereço do mediaInfo; args[1] = O endereço do arquivo de vídeo
     */
    public static void main(String[] args)
    {
        try
        {
            if(args != null)
            {
                if(args.length == 2)
                {
                    MediaControllerTest.mediaInfoUrl = args[0];
                    MediaControllerTest.videoFileUrl = args[1];
                }
            }
            
            Result result = JUnitCore.runClasses(MediaControllerTest.class);
            for (Failure failure : result.getFailures())
            {
                System.out.println(failure.toString());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
