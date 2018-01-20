package jvideoinfo.model;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Classe VO para consolidar um ponto comum de armazenamento de todos os VO's
 * 
 * @author Diego Steyner
 */
public class InfoMedia implements Serializable 
{
    private static final long serialVersionUID = 8959520927230291959L;
    
    private String rawData;
	private LinkedList<InfoGeral> infoGeral = new LinkedList<InfoGeral>();
	private LinkedList<InfoAudio> infoAudio = new LinkedList<InfoAudio>();
	private LinkedList<InfoVideo> infoVideo = new LinkedList<InfoVideo>();
	private LinkedList<InfoLegend> infoLegend = new LinkedList<InfoLegend>();

	/**
	 * Método que permite a adição de informações de audio
	 * 
	 * @param infoa As informações de audio que se deseja adicionar
	 */
	public void addInfoAudio(InfoAudio infoa)
    {
        this.infoAudio.add(infoa);
    }
    
	/**
	 * Método que permite a adição de informações de vídeo
	 * 
	 * @param infov As informações de vídeo que se deseja adicionar
	 */
    public void addInfoVideo(InfoVideo infov)
    {
        this.infoVideo.add(infov);
    }
    
    /**
     * Método que permite a adição de informações de legenda
     * 
     * @param infol As informações de legenda que se deseja adicionar
     */
    public void addInfoLegend(InfoLegend infol)
    {
        this.infoLegend.add(infol);
    }
    
    /**
     * Método que permite a adição de informações gerais
     * 
     * @param infog As informações gerais que se deseja adicionar
     */
    public void addInfoGeral(InfoGeral infog)
    {
        this.infoGeral.add(infog);
    }
	
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
    public LinkedList<InfoGeral> getInfoGeral()
    {
        return infoGeral;
    }
    
    /**
     * Método que configura um novo valor para a variável infoGeral
     * 
     * @param infoGeral O novo valor da variável
     */
    public void setInfoGeral(LinkedList<InfoGeral> infoGeral)
    {
        this.infoGeral = infoGeral;
    }
    
    /**
     * Método que retorna o valor da variável infoAudio
     * 
     * @return O valor da variável infoAudio
     */
    public LinkedList<InfoAudio> getInfoAudio()
    {
        return infoAudio;
    }
    
    /**
     * Método que configura um novo valor para a variável infoAudio
     * 
     * @param infoAudio O novo valor da variável
     */
    public void setInfoAudio(LinkedList<InfoAudio> infoAudio)
    {
        this.infoAudio = infoAudio;
    }
    
    /**
     * Método que retorna o valor da variável infoVideo
     * 
     * @return O valor da variável infoVideo
     */
    public LinkedList<InfoVideo> getInfoVideo()
    {
        return infoVideo;
    }
    
    /**
     * Método que configura um novo valor para a variável infoVideo
     * 
     * @param infoVideo O novo valor da variável
     */
    public void setInfoVideo(LinkedList<InfoVideo> infoVideo)
    {
        this.infoVideo = infoVideo;
    }
    
    /**
     * Método que retorna o valor da variável infoLegend
     * 
     * @return O valor da variável infoLegend
     */
    public LinkedList<InfoLegend> getInfoLegend()
    {
        return infoLegend;
    }
    
    /**
     * Método que configura um novo valor para a variável infoLegend
     * 
     * @param infoLegend O novo valor da variável
     */
    public void setInfoLegend(LinkedList<InfoLegend> infoLegend)
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
        return "InfoMedia [rawData=" + rawData + ", infoGeral=" + infoGeral + ", infoAudio=" + infoAudio + ", infoVideo=" + infoVideo + ", infoLegend=" + infoLegend + "]";
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
        result = prime * result + ((infoGeral == null) ? 0 : infoGeral.hashCode());
        result = prime * result + ((infoLegend == null) ? 0 : infoLegend.hashCode());
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
        InfoMedia other = (InfoMedia) obj;
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
