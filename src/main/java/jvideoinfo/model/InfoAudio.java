package jvideoinfo.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Classe VO para guardar as informações de audio
 * 
 * @author Diego Steyner
 */
public class InfoAudio implements Serializable
{
    private static final long serialVersionUID = 4904325932285219760L;
    
    private String rawData;
	private HashMap<String, String> infoAudio = new HashMap<String, String>();
	
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
     * Método que retorna o valor da variável infoAudio
     * 
     * @return O valor da variável infoAudio
     */
    public HashMap<String, String> getInfoAudio()
    {
        return infoAudio;
    }

    /**
     * Método que configura um novo valor para a variável infoAudio
     * 
     * @param infoAudio O novo valor da variável
     */
    public void setInfoAudio(HashMap<String, String> infoAudio)
    {
        this.infoAudio = infoAudio;
    }

    /**
     * Sem necessidade de Javadoc
     *  
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "InfoAudio [rawData=" + rawData + ", infoAudio=" + infoAudio + "]";
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
        result = prime * result + ((infoAudio == null) ? 0 : infoAudio.hashCode());
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
        InfoAudio other = (InfoAudio) obj;
        if (infoAudio == null)
        {
            if (other.infoAudio != null)
            {
                return false;
            }
        }
        else if (!infoAudio.equals(other.infoAudio))
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
