package mediainfo.data.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="track")
@XmlAccessorType(XmlAccessType.FIELD)
public class LegendaDTO extends MediaDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	@XmlAttribute (name = "typeorder")
	private String typeorder;
	
	private String ID;
	private String UniqueID;
	private String Format;
	private String CodecID;
	private String Title;
	private String Language;
	private String Default;
	private String Forced;
	private LegendaExtraDTO extra;
	
	public String getTypeorder() {
		return typeorder;
	}
	
	public void setTypeorder(String typeorder) {
		this.typeorder = typeorder;
	}
	
	public String getID() {
		return ID;
	}

	public String getUniqueID() {
		return UniqueID;
	}

	public void setUniqueID(String uniqueID) {
		UniqueID = uniqueID;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getCodecID() {
		return CodecID;
	}

	public void setCodecID(String codecID) {
		CodecID = codecID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getDefault() {
		return Default;
	}

	public void setDefault(String default1) {
		Default = default1;
	}

	public String getForced() {
		return Forced;
	}

	public void setForced(String forced) {
		Forced = forced;
	}

	public LegendaExtraDTO getExtra() {
		return extra;
	}

	public void setExtra(LegendaExtraDTO extra) {
		this.extra = extra;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodecID == null) ? 0 : CodecID.hashCode());
		result = prime * result + ((Default == null) ? 0 : Default.hashCode());
		result = prime * result + ((Forced == null) ? 0 : Forced.hashCode());
		result = prime * result + ((Format == null) ? 0 : Format.hashCode());
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((Language == null) ? 0 : Language.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + ((UniqueID == null) ? 0 : UniqueID.hashCode());
		result = prime * result + ((extra == null) ? 0 : extra.hashCode());
		result = prime * result + ((typeorder == null) ? 0 : typeorder.hashCode());
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
		LegendaDTO other = (LegendaDTO) obj;
		if (CodecID == null) {
			if (other.CodecID != null)
				return false;
		} else if (!CodecID.equals(other.CodecID))
			return false;
		if (Default == null) {
			if (other.Default != null)
				return false;
		} else if (!Default.equals(other.Default))
			return false;
		if (Forced == null) {
			if (other.Forced != null)
				return false;
		} else if (!Forced.equals(other.Forced))
			return false;
		if (Format == null) {
			if (other.Format != null)
				return false;
		} else if (!Format.equals(other.Format))
			return false;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (Language == null) {
			if (other.Language != null)
				return false;
		} else if (!Language.equals(other.Language))
			return false;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		if (UniqueID == null) {
			if (other.UniqueID != null)
				return false;
		} else if (!UniqueID.equals(other.UniqueID))
			return false;
		if (extra == null) {
			if (other.extra != null)
				return false;
		} else if (!extra.equals(other.extra))
			return false;
		if (typeorder == null) {
			if (other.typeorder != null)
				return false;
		} else if (!typeorder.equals(other.typeorder))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LegendaDTO [typeorder=" + typeorder + ", ID=" + ID + ", UniqueID=" + UniqueID + ", Format=" + Format
				+ ", CodecID=" + CodecID + ", Title=" + Title + ", Language=" + Language + ", Default=" + Default
				+ ", Forced=" + Forced + ", extra=" + extra + "]";
	}
}
