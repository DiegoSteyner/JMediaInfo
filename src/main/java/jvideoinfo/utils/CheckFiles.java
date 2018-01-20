package jvideoinfo.utils;

import java.io.File;
import java.util.List;

import jutil.utils.FileUtils;

/**
 * Classe para verificaçaõ de arquivos necessárias a execução do media info
 * 
 * @author Diego Steyner
 */
public class CheckFiles
{
    public static final String FILE_NAME_MEDIA_INFO_FOLDER = "Media Info";
    public static final String FILE_NAME_MEDIA_INFO_EXE    = "MediaInfo.exe";
    public static final String FILE_NAME_MEDIA_INFO_DLL    = "LIBCURL.DLL";
    
    /**
     * Método que verifica se uma determinada pasta possui os arquivos do media info
     * 
     * @param dir O diretório que se deseja verificar
     * 
     * @return Se True, A pasta possui os arquivos do media info
     * @throws Exception Caso ocorra algum erro uma exceção será lançada
     */
    public static boolean isMediaInfoDir(String dir) throws Exception
    {
        List<File> files = FileUtils.getFilesInFolder(dir, false, false);
        int count = 0;
        
        for (int i = 0; i < files.size(); i++)
        {
            if(files.get(i).getName().equalsIgnoreCase(FILE_NAME_MEDIA_INFO_EXE))
            {
                count++;
            }
            
            if(files.get(i).getName().equalsIgnoreCase(FILE_NAME_MEDIA_INFO_DLL))
            {
                count++;
            }
            
            if(count == 2)
            {
                break;
            }
        }
        
        return(count == 2);
    }

}
