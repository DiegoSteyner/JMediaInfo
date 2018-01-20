package jvideoinfo.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Classe VO para guardar as informações gerais
 * 
 * @author Diego Steyner
 */
public class InfoGeral implements Serializable
{
    private static final long serialVersionUID = 4237294255103861216L;
    
    private String rawData;
	private HashMap<String, String> infoGeral = new HashMap<String, String>();
    
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
     * Método que retorna o valor da variável infoGeral
     * 
     * @return O valor da variável infoGeral
     */
    public HashMap<String, String> getInfoGeral()
    {
        return infoGeral;
    }

    /**
     * Método que configura um novo valor para a variável infoGeral
     * 
     * @param infoGeral O novo valor da variável
     */
    public void setInfoGeral(HashMap<String, String> infoGeral)
    {
        this.infoGeral = infoGeral;
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
        result = prime * result + ((infoGeral == null) ? 0 : infoGeral.hashCode());
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
        InfoGeral other = (InfoGeral) obj;
        if (infoGeral == null)
        {
            if (other.infoGeral != null)
            {
                return false;
            }
        }
        else if (!infoGeral.equals(other.infoGeral))
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

    /**
     * Sem necessidade de Javadoc
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "InfoGeral [rawData=" + rawData + ", infoGeral=" + infoGeral + "]";
    }
}
