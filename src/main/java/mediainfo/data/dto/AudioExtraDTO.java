package mediainfo.data.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="extra")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudioExtraDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String Statistics_Tags_Issue;
	private String FromStats_BitRate;
	private String FromStats_Duration;
	private String FromStats_FrameCount;
	private String FromStats_StreamSize;
	private String bsid;
	private String dialnorm;
	private String compr;
	private String acmod;
	private String lfeon;
	private String dialnorm_Average;
	private String dialnorm_Minimum;
	private String compr_Average;
	private String compr_Minimum;
	private String compr_Maximum;
	private String compr_Count;
	
	public String getStatistics_Tags_Issue() {
		return Statistics_Tags_Issue;
	}
	
	public void setStatistics_Tags_Issue(String statistics_Tags_Issue) {
		Statistics_Tags_Issue = statistics_Tags_Issue;
	}
	
	public String getFromStats_BitRate() {
		return FromStats_BitRate;
	}

	public String getFromStats_Duration() {
		return FromStats_Duration;
	}

	public void setFromStats_Duration(String fromStats_Duration) {
		FromStats_Duration = fromStats_Duration;
	}

	public String getFromStats_FrameCount() {
		return FromStats_FrameCount;
	}

	public void setFromStats_FrameCount(String fromStats_FrameCount) {
		FromStats_FrameCount = fromStats_FrameCount;
	}

	public String getFromStats_StreamSize() {
		return FromStats_StreamSize;
	}

	public void setFromStats_StreamSize(String fromStats_StreamSize) {
		FromStats_StreamSize = fromStats_StreamSize;
	}

	public String getBsid() {
		return bsid;
	}

	public void setBsid(String bsid) {
		this.bsid = bsid;
	}

	public String getDialnorm() {
		return dialnorm;
	}

	public void setDialnorm(String dialnorm) {
		this.dialnorm = dialnorm;
	}

	public String getCompr() {
		return compr;
	}

	public void setCompr(String compr) {
		this.compr = compr;
	}

	public String getAcmod() {
		return acmod;
	}

	public void setAcmod(String acmod) {
		this.acmod = acmod;
	}

	public String getLfeon() {
		return lfeon;
	}

	public void setLfeon(String lfeon) {
		this.lfeon = lfeon;
	}

	public String getDialnorm_Average() {
		return dialnorm_Average;
	}

	public void setDialnorm_Average(String dialnorm_Average) {
		this.dialnorm_Average = dialnorm_Average;
	}

	public String getDialnorm_Minimum() {
		return dialnorm_Minimum;
	}

	public void setDialnorm_Minimum(String dialnorm_Minimum) {
		this.dialnorm_Minimum = dialnorm_Minimum;
	}

	public String getCompr_Average() {
		return compr_Average;
	}

	public void setCompr_Average(String compr_Average) {
		this.compr_Average = compr_Average;
	}

	public String getCompr_Minimum() {
		return compr_Minimum;
	}

	public void setCompr_Minimum(String compr_Minimum) {
		this.compr_Minimum = compr_Minimum;
	}

	public String getCompr_Maximum() {
		return compr_Maximum;
	}

	public void setCompr_Maximum(String compr_Maximum) {
		this.compr_Maximum = compr_Maximum;
	}

	public String getCompr_Count() {
		return compr_Count;
	}

	public void setCompr_Count(String compr_Count) {
		this.compr_Count = compr_Count;
	}

	public void setFromStats_BitRate(String fromStats_BitRate) {
		FromStats_BitRate = fromStats_BitRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FromStats_BitRate == null) ? 0 : FromStats_BitRate.hashCode());
		result = prime * result + ((FromStats_Duration == null) ? 0 : FromStats_Duration.hashCode());
		result = prime * result + ((FromStats_FrameCount == null) ? 0 : FromStats_FrameCount.hashCode());
		result = prime * result + ((FromStats_StreamSize == null) ? 0 : FromStats_StreamSize.hashCode());
		result = prime * result + ((Statistics_Tags_Issue == null) ? 0 : Statistics_Tags_Issue.hashCode());
		result = prime * result + ((acmod == null) ? 0 : acmod.hashCode());
		result = prime * result + ((bsid == null) ? 0 : bsid.hashCode());
		result = prime * result + ((compr == null) ? 0 : compr.hashCode());
		result = prime * result + ((compr_Average == null) ? 0 : compr_Average.hashCode());
		result = prime * result + ((compr_Count == null) ? 0 : compr_Count.hashCode());
		result = prime * result + ((compr_Maximum == null) ? 0 : compr_Maximum.hashCode());
		result = prime * result + ((compr_Minimum == null) ? 0 : compr_Minimum.hashCode());
		result = prime * result + ((dialnorm == null) ? 0 : dialnorm.hashCode());
		result = prime * result + ((dialnorm_Average == null) ? 0 : dialnorm_Average.hashCode());
		result = prime * result + ((dialnorm_Minimum == null) ? 0 : dialnorm_Minimum.hashCode());
		result = prime * result + ((lfeon == null) ? 0 : lfeon.hashCode());
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
		AudioExtraDTO other = (AudioExtraDTO) obj;
		if (FromStats_BitRate == null) {
			if (other.FromStats_BitRate != null)
				return false;
		} else if (!FromStats_BitRate.equals(other.FromStats_BitRate))
			return false;
		if (FromStats_Duration == null) {
			if (other.FromStats_Duration != null)
				return false;
		} else if (!FromStats_Duration.equals(other.FromStats_Duration))
			return false;
		if (FromStats_FrameCount == null) {
			if (other.FromStats_FrameCount != null)
				return false;
		} else if (!FromStats_FrameCount.equals(other.FromStats_FrameCount))
			return false;
		if (FromStats_StreamSize == null) {
			if (other.FromStats_StreamSize != null)
				return false;
		} else if (!FromStats_StreamSize.equals(other.FromStats_StreamSize))
			return false;
		if (Statistics_Tags_Issue == null) {
			if (other.Statistics_Tags_Issue != null)
				return false;
		} else if (!Statistics_Tags_Issue.equals(other.Statistics_Tags_Issue))
			return false;
		if (acmod == null) {
			if (other.acmod != null)
				return false;
		} else if (!acmod.equals(other.acmod))
			return false;
		if (bsid == null) {
			if (other.bsid != null)
				return false;
		} else if (!bsid.equals(other.bsid))
			return false;
		if (compr == null) {
			if (other.compr != null)
				return false;
		} else if (!compr.equals(other.compr))
			return false;
		if (compr_Average == null) {
			if (other.compr_Average != null)
				return false;
		} else if (!compr_Average.equals(other.compr_Average))
			return false;
		if (compr_Count == null) {
			if (other.compr_Count != null)
				return false;
		} else if (!compr_Count.equals(other.compr_Count))
			return false;
		if (compr_Maximum == null) {
			if (other.compr_Maximum != null)
				return false;
		} else if (!compr_Maximum.equals(other.compr_Maximum))
			return false;
		if (compr_Minimum == null) {
			if (other.compr_Minimum != null)
				return false;
		} else if (!compr_Minimum.equals(other.compr_Minimum))
			return false;
		if (dialnorm == null) {
			if (other.dialnorm != null)
				return false;
		} else if (!dialnorm.equals(other.dialnorm))
			return false;
		if (dialnorm_Average == null) {
			if (other.dialnorm_Average != null)
				return false;
		} else if (!dialnorm_Average.equals(other.dialnorm_Average))
			return false;
		if (dialnorm_Minimum == null) {
			if (other.dialnorm_Minimum != null)
				return false;
		} else if (!dialnorm_Minimum.equals(other.dialnorm_Minimum))
			return false;
		if (lfeon == null) {
			if (other.lfeon != null)
				return false;
		} else if (!lfeon.equals(other.lfeon))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AudioExtraDTO [Statistics_Tags_Issue=" + Statistics_Tags_Issue + ", FromStats_BitRate="
				+ FromStats_BitRate + ", FromStats_Duration=" + FromStats_Duration + ", FromStats_FrameCount="
				+ FromStats_FrameCount + ", FromStats_StreamSize=" + FromStats_StreamSize + ", bsid=" + bsid
				+ ", dialnorm=" + dialnorm + ", compr=" + compr + ", acmod=" + acmod + ", lfeon=" + lfeon
				+ ", dialnorm_Average=" + dialnorm_Average + ", dialnorm_Minimum=" + dialnorm_Minimum
				+ ", compr_Average=" + compr_Average + ", compr_Minimum=" + compr_Minimum + ", compr_Maximum="
				+ compr_Maximum + ", compr_Count=" + compr_Count + "]";
	}
}
