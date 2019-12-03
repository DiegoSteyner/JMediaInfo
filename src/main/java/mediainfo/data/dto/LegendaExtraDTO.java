package mediainfo.data.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="extra")
@XmlAccessorType(XmlAccessType.FIELD)
public class LegendaExtraDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String Statistics_Tags_Issue;
	private String FromStats_BitRate;
	private String FromStats_Duration;
	private String FromStats_FrameCount;
	private String FromStats_StreamSize;
	
	public String getStatistics_Tags_Issue() {
		return Statistics_Tags_Issue;
	}
	
	public void setStatistics_Tags_Issue(String statistics_Tags_Issue) {
		Statistics_Tags_Issue = statistics_Tags_Issue;
	}
	
	public String getFromStats_BitRate() {
		return FromStats_BitRate;
	}
	
	public void setFromStats_BitRate(String fromStats_BitRate) {
		FromStats_BitRate = fromStats_BitRate;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FromStats_BitRate == null) ? 0 : FromStats_BitRate.hashCode());
		result = prime * result + ((FromStats_Duration == null) ? 0 : FromStats_Duration.hashCode());
		result = prime * result + ((FromStats_FrameCount == null) ? 0 : FromStats_FrameCount.hashCode());
		result = prime * result + ((FromStats_StreamSize == null) ? 0 : FromStats_StreamSize.hashCode());
		result = prime * result + ((Statistics_Tags_Issue == null) ? 0 : Statistics_Tags_Issue.hashCode());
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
		LegendaExtraDTO other = (LegendaExtraDTO) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "LegendaExtraDTO [Statistics_Tags_Issue=" + Statistics_Tags_Issue + ", FromStats_BitRate="
				+ FromStats_BitRate + ", FromStats_Duration=" + FromStats_Duration + ", FromStats_FrameCount="
				+ FromStats_FrameCount + ", FromStats_StreamSize=" + FromStats_StreamSize + "]";
	}
}

