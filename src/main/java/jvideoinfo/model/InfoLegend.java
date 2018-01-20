package jvideoinfo.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Classe VO para guardar as informações de legendas
 * 
 * @author Diego Steyner
 */
public class InfoLegend implements Serializable {

    private static final long serialVersionUID = 7953600546326242708L;
    
    private String rawData;
	private HashMap<String, String> infoLegend = new HashMap<String, String>();
    
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
     * Método que retorna o valor da variável infoLegend
     * 
     * @return O valor da variável infoLegend
     */
    public HashMap<String, String> getInfoLegend()
    {
        return infoLegend;
    }
    
    /**
     * Método que configura um novo valor para a variável infoLegend
     * 
     * @param infoLegend O novo valor da variável
     */
    public void setInfoLegend(HashMap<String, String> infoLegend)
    {
        this.infoLegend = infoLegend;
    }

    /**
     * Sem necessidade de Javadoc
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "InfoLegend [rawData=" + rawData + ", infoLegend=" + infoLegend + "]";
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
        result = prime * result + ((infoLegend == null) ? 0 : infoLegend.hashCode());
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
        InfoLegend other = (InfoLegend) obj;
        if (infoLegend == null)
        {
            if (other.infoLegend != null)
            {
                return false;
            }
        }
        else if (!infoLegend.equals(other.infoLegend))
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
