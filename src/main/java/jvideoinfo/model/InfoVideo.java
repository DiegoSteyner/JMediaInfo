package jvideoinfo.model;

import java.io.Serializable;
import java.util.HashMap;

public class InfoVideo implements Serializable
{
    private static final long serialVersionUID = 7774998254607277586L;
    
    private String rawData;
	private HashMap<String, String> infoVideo = new HashMap<String, String>();
    
	/**
     * Método que retorna o valor da variável rawData
     * 
     * @return O valor da variável rawData
     */
    public String getRawData()
    {
        return rawData;
    }
    
    /**
     * Método que configura um novo valor para a variável rawData
     * 
     * @param rawData O novo valor da variável
     */
    public void setRawData(String rawData)
    {
        this.rawData = rawData;
    }
    
    /**
     * Método que retorna o valor da variável infoVideo
     * 
     * @return O valor da variável infoVideo
     */
    public HashMap<String, String> getInfoVideo()
    {
        return infoVideo;
    }
    
    /**
     * Método que configura um novo valor para a variável infoVideo
     * 
     * @param infoVideo O novo valor da variável
     */
    public void setInfoVideo(HashMap<String, String> infoVideo)
    {
        this.infoVideo = infoVideo;
    }

    /**
     * Sem necessidade de Javadoc
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "InfoVideo [rawData=" + rawData + ", infoVideo=" + infoVideo + "]";
    }

    /**
     * Sem necessidade de Javadoc
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((infoVideo == null) ? 0 : infoVideo.hashCode());
        result = prime * result + ((rawData == null) ? 0 : rawData.hashCode());
        return result;
    }

    /**
     * Sem necessidade de Javadoc
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        InfoVideo other = (InfoVideo) obj;
        if (infoVideo == null)
        {
            if (other.infoVideo != null)
            {
                return false;
            }
        }
        else if (!infoVideo.equals(other.infoVideo))
        {
            return false;
        }
        if (rawData == null)
        {
            if (other.rawData != null)
            {
                return false;
            }
        }
        else if (!rawData.equals(other.rawData))
        {
            return false;
        }
        return true;
    }
}
