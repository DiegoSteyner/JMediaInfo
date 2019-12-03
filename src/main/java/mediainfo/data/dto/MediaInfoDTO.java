package mediainfo.data.dto;

import java.io.Serializable;
import java.util.List;

public class MediaInfoDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private GeralDTO informacoesGerais;
	private List<VideoDTO> videos;
	private List<AudioDTO> audios;
	private List<LegendaDTO> legendas;

	public MediaInfoDTO(List<VideoDTO> videos, List<AudioDTO> audios, List<LegendaDTO> legendas) 
	{
		super();
		this.videos = videos;
		this.audios = audios;
		this.legendas = legendas;
	}

	public GeralDTO getInformacoesGerais() {
		return informacoesGerais;
	}
	
	public void setInformacoesGerais(GeralDTO informacoesGerais) {
		this.informacoesGerais = informacoesGerais;
	}
	
	public List<VideoDTO> getVideos() {
		return videos;
	}
	
	public void setVideos(List<VideoDTO> videos) {
		this.videos = videos;
	}
	
	public List<AudioDTO> getAudios() {
		return audios;
	}
	
	public void setAudios(List<AudioDTO> audios) {
		this.audios = audios;
	}
	
	public List<LegendaDTO> getLegendas() {
		return legendas;
	}
	
	public void setLegendas(List<LegendaDTO> legendas) {
		this.legendas = legendas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((audios == null) ? 0 : audios.hashCode());
		result = prime * result + ((informacoesGerais == null) ? 0 : informacoesGerais.hashCode());
		result = prime * result + ((legendas == null) ? 0 : legendas.hashCode());
		result = prime * result + ((videos == null) ? 0 : videos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaInfoDTO other = (MediaInfoDTO) obj;
		if (audios == null) {
			if (other.audios != null)
				return false;
		} else if (!audios.equals(other.audios))
			return false;
		if (informacoesGerais == null) {
			if (other.informacoesGerais != null)
				return false;
		} else if (!informacoesGerais.equals(other.informacoesGerais))
			return false;
		if (legendas == null) {
			if (other.legendas != null)
				return false;
		} else if (!legendas.equals(other.legendas))
			return false;
		if (videos == null) {
			if (other.videos != null)
				return false;
		} else if (!videos.equals(other.videos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MediaInfoDTO [informacoesGerais=" + informacoesGerais + ", videos=" + videos + ", audios=" + audios
				+ ", legendas=" + legendas + "]";
	}
}
