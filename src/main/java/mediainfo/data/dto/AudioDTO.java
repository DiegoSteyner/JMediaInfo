package mediainfo.data.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="track")
@XmlAccessorType(XmlAccessType.FIELD)
public class AudioDTO extends MediaDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@XmlAttribute (name = "typeorder")
	private String audioIndex;
	
	private String StreamOrder;
	private String ID;
	private String UniqueID;
	private String Format;
	private String Format_Commercial_IfAny;
	private String Format_Settings_Endianness;
	private String CodecID;
	private String Duration;
	private String BitRate_Mode;
	private String BitRate;
	private String Channels;
	private String ChannelPositions;
	private String ChannelLayout;
	private String SamplesPerFrame;
	private String SamplingRate;
	private String SamplingCount;
	private String FrameRate;
	private String BitDepth;
	private String Compression_Mode;
	private String Delay;
	private String Delay_Source;
	private String StreamSize;
	private String StreamSize_Proportion;
	private String Language;
	private String ServiceKind;
	private String Default;
	private String Forced;
	private AudioExtraDTO extra;
	
	public String getAudioIndex() {
		return audioIndex;
	}
	
	public void setAudioIndex(String audioIndex) {
		this.audioIndex = audioIndex;
	}
	
	public String getStreamOrder() {
		return StreamOrder;
	}
	
	public void setStreamOrder(String streamOrder) {
		StreamOrder = streamOrder;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
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
	
	public String getFormat_Commercial_IfAny() {
		return Format_Commercial_IfAny;
	}
	
	public void setFormat_Commercial_IfAny(String format_Commercial_IfAny) {
		Format_Commercial_IfAny = format_Commercial_IfAny;
	}
	
	public String getFormat_Settings_Endianness() {
		return Format_Settings_Endianness;
	}
	
	public void setFormat_Settings_Endianness(String format_Settings_Endianness) {
		Format_Settings_Endianness = format_Settings_Endianness;
	}
	
	public String getCodecID() {
		return CodecID;
	}
	
	public void setCodecID(String codecID) {
		CodecID = codecID;
	}
	
	public String getDuration() {
		return Duration;
	}
	
	public void setDuration(String duration) {
		Duration = duration;
	}
	
	public String getBitRate_Mode() {
		return BitRate_Mode;
	}
	
	public void setBitRate_Mode(String bitRate_Mode) {
		BitRate_Mode = bitRate_Mode;
	}
	
	public String getBitRate() {
		return BitRate;
	}
	
	public void setBitRate(String bitRate) {
		BitRate = bitRate;
	}
	
	public String getChannels() {
		return Channels;
	}
	
	public void setChannels(String channels) {
		Channels = channels;
	}
	
	public String getChannelPositions() {
		return ChannelPositions;
	}
	
	public void setChannelPositions(String channelPositions) {
		ChannelPositions = channelPositions;
	}
	
	public String getChannelLayout() {
		return ChannelLayout;
	}
	
	public void setChannelLayout(String channelLayout) {
		ChannelLayout = channelLayout;
	}
	
	public String getSamplesPerFrame() {
		return SamplesPerFrame;
	}
	
	public void setSamplesPerFrame(String samplesPerFrame) {
		SamplesPerFrame = samplesPerFrame;
	}
	
	public String getSamplingRate() {
		return SamplingRate;
	}
	
	public void setSamplingRate(String samplingRate) {
		SamplingRate = samplingRate;
	}
	
	public String getSamplingCount() {
		return SamplingCount;
	}
	
	public void setSamplingCount(String samplingCount) {
		SamplingCount = samplingCount;
	}
	
	public String getFrameRate() {
		return FrameRate;
	}
	
	public void setFrameRate(String frameRate) {
		FrameRate = frameRate;
	}
	
	public String getBitDepth() {
		return BitDepth;
	}
	
	public void setBitDepth(String bitDepth) {
		BitDepth = bitDepth;
	}
	
	public String getCompression_Mode() {
		return Compression_Mode;
	}
	
	public void setCompression_Mode(String compression_Mode) {
		Compression_Mode = compression_Mode;
	}
	
	public String getDelay() {
		return Delay;
	}
	
	public void setDelay(String delay) {
		Delay = delay;
	}
	
	public String getDelay_Source() {
		return Delay_Source;
	}
	
	public void setDelay_Source(String delay_Source) {
		Delay_Source = delay_Source;
	}
	
	public String getStreamSize() {
		return StreamSize;
	}
	
	public void setStreamSize(String streamSize) {
		StreamSize = streamSize;
	}
	
	public String getStreamSize_Proportion() {
		return StreamSize_Proportion;
	}
	
	public void setStreamSize_Proportion(String streamSize_Proportion) {
		StreamSize_Proportion = streamSize_Proportion;
	}
	
	public String getLanguage() {
		return Language;
	}
	
	public void setLanguage(String language) {
		Language = language;
	}
	
	public String getServiceKind() {
		return ServiceKind;
	}
	
	public void setServiceKind(String serviceKind) {
		ServiceKind = serviceKind;
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
	
	public AudioExtraDTO getExtra() {
		return extra;
	}
	
	public void setExtra(AudioExtraDTO extra) {
		this.extra = extra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BitDepth == null) ? 0 : BitDepth.hashCode());
		result = prime * result + ((BitRate == null) ? 0 : BitRate.hashCode());
		result = prime * result + ((BitRate_Mode == null) ? 0 : BitRate_Mode.hashCode());
		result = prime * result + ((ChannelLayout == null) ? 0 : ChannelLayout.hashCode());
		result = prime * result + ((ChannelPositions == null) ? 0 : ChannelPositions.hashCode());
		result = prime * result + ((Channels == null) ? 0 : Channels.hashCode());
		result = prime * result + ((CodecID == null) ? 0 : CodecID.hashCode());
		result = prime * result + ((Compression_Mode == null) ? 0 : Compression_Mode.hashCode());
		result = prime * result + ((Default == null) ? 0 : Default.hashCode());
		result = prime * result + ((Delay == null) ? 0 : Delay.hashCode());
		result = prime * result + ((Delay_Source == null) ? 0 : Delay_Source.hashCode());
		result = prime * result + ((Duration == null) ? 0 : Duration.hashCode());
		result = prime * result + ((Forced == null) ? 0 : Forced.hashCode());
		result = prime * result + ((Format == null) ? 0 : Format.hashCode());
		result = prime * result + ((Format_Commercial_IfAny == null) ? 0 : Format_Commercial_IfAny.hashCode());
		result = prime * result + ((Format_Settings_Endianness == null) ? 0 : Format_Settings_Endianness.hashCode());
		result = prime * result + ((FrameRate == null) ? 0 : FrameRate.hashCode());
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((Language == null) ? 0 : Language.hashCode());
		result = prime * result + ((SamplesPerFrame == null) ? 0 : SamplesPerFrame.hashCode());
		result = prime * result + ((SamplingCount == null) ? 0 : SamplingCount.hashCode());
		result = prime * result + ((SamplingRate == null) ? 0 : SamplingRate.hashCode());
		result = prime * result + ((ServiceKind == null) ? 0 : ServiceKind.hashCode());
		result = prime * result + ((StreamOrder == null) ? 0 : StreamOrder.hashCode());
		result = prime * result + ((StreamSize == null) ? 0 : StreamSize.hashCode());
		result = prime * result + ((StreamSize_Proportion == null) ? 0 : StreamSize_Proportion.hashCode());
		result = prime * result + ((UniqueID == null) ? 0 : UniqueID.hashCode());
		result = prime * result + ((audioIndex == null) ? 0 : audioIndex.hashCode());
		result = prime * result + ((extra == null) ? 0 : extra.hashCode());
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
		AudioDTO other = (AudioDTO) obj;
		if (BitDepth == null) {
			if (other.BitDepth != null)
				return false;
		} else if (!BitDepth.equals(other.BitDepth))
			return false;
		if (BitRate == null) {
			if (other.BitRate != null)
				return false;
		} else if (!BitRate.equals(other.BitRate))
			return false;
		if (BitRate_Mode == null) {
			if (other.BitRate_Mode != null)
				return false;
		} else if (!BitRate_Mode.equals(other.BitRate_Mode))
			return false;
		if (ChannelLayout == null) {
			if (other.ChannelLayout != null)
				return false;
		} else if (!ChannelLayout.equals(other.ChannelLayout))
			return false;
		if (ChannelPositions == null) {
			if (other.ChannelPositions != null)
				return false;
		} else if (!ChannelPositions.equals(other.ChannelPositions))
			return false;
		if (Channels == null) {
			if (other.Channels != null)
				return false;
		} else if (!Channels.equals(other.Channels))
			return false;
		if (CodecID == null) {
			if (other.CodecID != null)
				return false;
		} else if (!CodecID.equals(other.CodecID))
			return false;
		if (Compression_Mode == null) {
			if (other.Compression_Mode != null)
				return false;
		} else if (!Compression_Mode.equals(other.Compression_Mode))
			return false;
		if (Default == null) {
			if (other.Default != null)
				return false;
		} else if (!Default.equals(other.Default))
			return false;
		if (Delay == null) {
			if (other.Delay != null)
				return false;
		} else if (!Delay.equals(other.Delay))
			return false;
		if (Delay_Source == null) {
			if (other.Delay_Source != null)
				return false;
		} else if (!Delay_Source.equals(other.Delay_Source))
			return false;
		if (Duration == null) {
			if (other.Duration != null)
				return false;
		} else if (!Duration.equals(other.Duration))
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
		if (Format_Commercial_IfAny == null) {
			if (other.Format_Commercial_IfAny != null)
				return false;
		} else if (!Format_Commercial_IfAny.equals(other.Format_Commercial_IfAny))
			return false;
		if (Format_Settings_Endianness == null) {
			if (other.Format_Settings_Endianness != null)
				return false;
		} else if (!Format_Settings_Endianness.equals(other.Format_Settings_Endianness))
			return false;
		if (FrameRate == null) {
			if (other.FrameRate != null)
				return false;
		} else if (!FrameRate.equals(other.FrameRate))
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
		if (SamplesPerFrame == null) {
			if (other.SamplesPerFrame != null)
				return false;
		} else if (!SamplesPerFrame.equals(other.SamplesPerFrame))
			return false;
		if (SamplingCount == null) {
			if (other.SamplingCount != null)
				return false;
		} else if (!SamplingCount.equals(other.SamplingCount))
			return false;
		if (SamplingRate == null) {
			if (other.SamplingRate != null)
				return false;
		} else if (!SamplingRate.equals(other.SamplingRate))
			return false;
		if (ServiceKind == null) {
			if (other.ServiceKind != null)
				return false;
		} else if (!ServiceKind.equals(other.ServiceKind))
			return false;
		if (StreamOrder == null) {
			if (other.StreamOrder != null)
				return false;
		} else if (!StreamOrder.equals(other.StreamOrder))
			return false;
		if (StreamSize == null) {
			if (other.StreamSize != null)
				return false;
		} else if (!StreamSize.equals(other.StreamSize))
			return false;
		if (StreamSize_Proportion == null) {
			if (other.StreamSize_Proportion != null)
				return false;
		} else if (!StreamSize_Proportion.equals(other.StreamSize_Proportion))
			return false;
		if (UniqueID == null) {
			if (other.UniqueID != null)
				return false;
		} else if (!UniqueID.equals(other.UniqueID))
			return false;
		if (audioIndex == null) {
			if (other.audioIndex != null)
				return false;
		} else if (!audioIndex.equals(other.audioIndex))
			return false;
		if (extra == null) {
			if (other.extra != null)
				return false;
		} else if (!extra.equals(other.extra))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AudioDTO [audioIndex=" + audioIndex + ", StreamOrder=" + StreamOrder + ", ID=" + ID + ", UniqueID="
				+ UniqueID + ", Format=" + Format + ", Format_Commercial_IfAny=" + Format_Commercial_IfAny
				+ ", Format_Settings_Endianness=" + Format_Settings_Endianness + ", CodecID=" + CodecID + ", Duration="
				+ Duration + ", BitRate_Mode=" + BitRate_Mode + ", BitRate=" + BitRate + ", Channels=" + Channels
				+ ", ChannelPositions=" + ChannelPositions + ", ChannelLayout=" + ChannelLayout + ", SamplesPerFrame="
				+ SamplesPerFrame + ", SamplingRate=" + SamplingRate + ", SamplingCount=" + SamplingCount
				+ ", FrameRate=" + FrameRate + ", BitDepth=" + BitDepth + ", Compression_Mode=" + Compression_Mode
				+ ", Delay=" + Delay + ", Delay_Source=" + Delay_Source + ", StreamSize=" + StreamSize
				+ ", StreamSize_Proportion=" + StreamSize_Proportion + ", Language=" + Language + ", ServiceKind="
				+ ServiceKind + ", Default=" + Default + ", Forced=" + Forced + ", extra=" + extra + "]";
	}
}
