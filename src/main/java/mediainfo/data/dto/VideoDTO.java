package mediainfo.data.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="track")
@XmlAccessorType(XmlAccessType.FIELD)
public class VideoDTO extends MediaDTO implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private String StreamOrder;
	private String ID;
	private String UniqueID;
	private String Format;
	private String Format_Profile;
	private String Format_Level;
	private String Format_Settings_CABAC;
	private String Format_Settings_RefFrames;
	private String CodecID;
	private String Duration;
	private String BitRate_Mode;
	private String BitRate;
	private String BitRate_Maximum;
	private String Width;
	private String Height;
	private String Stored_Height;
	private String Sampled_Width;
	private String Sampled_Height;
	private String PixelAspectRatio;
	private String DisplayAspectRatio;
	private String FrameRate_Mode;
	private String FrameRate;
	private String FrameCount;
	private String ColorSpace;
	private String ChromaSubsampling;
	private String BitDepth;
	private String ScanType;
	private String Delay;
	private String StreamSize;
	private String Title;
	private String Encoded_Library;
	private String Encoded_Library_Name;
	private String Encoded_Library_Version;
	private String Encoded_Library_Settings;
	private String Language;
	private String Default;
	private String Forced;
	private String BufferSize;
	private VideoExtraDTO extra;
	
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

	public String getFormat_Profile() {
		return Format_Profile;
	}

	public void setFormat_Profile(String format_Profile) {
		Format_Profile = format_Profile;
	}

	public String getFormat_Level() {
		return Format_Level;
	}

	public void setFormat_Level(String format_Level) {
		Format_Level = format_Level;
	}

	public String getFormat_Settings_CABAC() {
		return Format_Settings_CABAC;
	}

	public void setFormat_Settings_CABAC(String format_Settings_CABAC) {
		Format_Settings_CABAC = format_Settings_CABAC;
	}

	public String getFormat_Settings_RefFrames() {
		return Format_Settings_RefFrames;
	}

	public void setFormat_Settings_RefFrames(String format_Settings_RefFrames) {
		Format_Settings_RefFrames = format_Settings_RefFrames;
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

	public String getBitRate_Maximum() {
		return BitRate_Maximum;
	}

	public void setBitRate_Maximum(String bitRate_Maximum) {
		BitRate_Maximum = bitRate_Maximum;
	}

	public String getWidth() {
		return Width;
	}

	public void setWidth(String width) {
		Width = width;
	}

	public String getHeight() {
		return Height;
	}

	public void setHeight(String height) {
		Height = height;
	}

	public String getStored_Height() {
		return Stored_Height;
	}

	public void setStored_Height(String stored_Height) {
		Stored_Height = stored_Height;
	}

	public String getSampled_Width() {
		return Sampled_Width;
	}

	public void setSampled_Width(String sampled_Width) {
		Sampled_Width = sampled_Width;
	}

	public String getSampled_Height() {
		return Sampled_Height;
	}

	public void setSampled_Height(String sampled_Height) {
		Sampled_Height = sampled_Height;
	}

	public String getPixelAspectRatio() {
		return PixelAspectRatio;
	}

	public void setPixelAspectRatio(String pixelAspectRatio) {
		PixelAspectRatio = pixelAspectRatio;
	}

	public String getDisplayAspectRatio() {
		return DisplayAspectRatio;
	}

	public void setDisplayAspectRatio(String displayAspectRatio) {
		DisplayAspectRatio = displayAspectRatio;
	}

	public String getFrameRate_Mode() {
		return FrameRate_Mode;
	}

	public void setFrameRate_Mode(String frameRate_Mode) {
		FrameRate_Mode = frameRate_Mode;
	}

	public String getFrameRate() {
		return FrameRate;
	}

	public void setFrameRate(String frameRate) {
		FrameRate = frameRate;
	}

	public String getFrameCount() {
		return FrameCount;
	}

	public void setFrameCount(String frameCount) {
		FrameCount = frameCount;
	}

	public String getColorSpace() {
		return ColorSpace;
	}

	public void setColorSpace(String colorSpace) {
		ColorSpace = colorSpace;
	}

	public String getChromaSubsampling() {
		return ChromaSubsampling;
	}

	public void setChromaSubsampling(String chromaSubsampling) {
		ChromaSubsampling = chromaSubsampling;
	}

	public String getBitDepth() {
		return BitDepth;
	}

	public void setBitDepth(String bitDepth) {
		BitDepth = bitDepth;
	}

	public String getScanType() {
		return ScanType;
	}

	public void setScanType(String scanType) {
		ScanType = scanType;
	}

	public String getDelay() {
		return Delay;
	}

	public void setDelay(String delay) {
		Delay = delay;
	}

	public String getStreamSize() {
		return StreamSize;
	}

	public void setStreamSize(String streamSize) {
		StreamSize = streamSize;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getEncoded_Library() {
		return Encoded_Library;
	}

	public void setEncoded_Library(String encoded_Library) {
		Encoded_Library = encoded_Library;
	}

	public String getEncoded_Library_Name() {
		return Encoded_Library_Name;
	}

	public void setEncoded_Library_Name(String encoded_Library_Name) {
		Encoded_Library_Name = encoded_Library_Name;
	}

	public String getEncoded_Library_Version() {
		return Encoded_Library_Version;
	}

	public void setEncoded_Library_Version(String encoded_Library_Version) {
		Encoded_Library_Version = encoded_Library_Version;
	}

	public String getEncoded_Library_Settings() {
		return Encoded_Library_Settings;
	}

	public void setEncoded_Library_Settings(String encoded_Library_Settings) {
		Encoded_Library_Settings = encoded_Library_Settings;
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

	public String getBufferSize() {
		return BufferSize;
	}

	public void setBufferSize(String bufferSize) {
		BufferSize = bufferSize;
	}

	public VideoExtraDTO getExtra() {
		return extra;
	}

	public void setExtra(VideoExtraDTO extra) {
		this.extra = extra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BitDepth == null) ? 0 : BitDepth.hashCode());
		result = prime * result + ((BitRate == null) ? 0 : BitRate.hashCode());
		result = prime * result + ((BitRate_Maximum == null) ? 0 : BitRate_Maximum.hashCode());
		result = prime * result + ((BitRate_Mode == null) ? 0 : BitRate_Mode.hashCode());
		result = prime * result + ((BufferSize == null) ? 0 : BufferSize.hashCode());
		result = prime * result + ((ChromaSubsampling == null) ? 0 : ChromaSubsampling.hashCode());
		result = prime * result + ((CodecID == null) ? 0 : CodecID.hashCode());
		result = prime * result + ((ColorSpace == null) ? 0 : ColorSpace.hashCode());
		result = prime * result + ((Default == null) ? 0 : Default.hashCode());
		result = prime * result + ((Delay == null) ? 0 : Delay.hashCode());
		result = prime * result + ((DisplayAspectRatio == null) ? 0 : DisplayAspectRatio.hashCode());
		result = prime * result + ((Duration == null) ? 0 : Duration.hashCode());
		result = prime * result + ((Encoded_Library == null) ? 0 : Encoded_Library.hashCode());
		result = prime * result + ((Encoded_Library_Name == null) ? 0 : Encoded_Library_Name.hashCode());
		result = prime * result + ((Encoded_Library_Settings == null) ? 0 : Encoded_Library_Settings.hashCode());
		result = prime * result + ((Encoded_Library_Version == null) ? 0 : Encoded_Library_Version.hashCode());
		result = prime * result + ((Forced == null) ? 0 : Forced.hashCode());
		result = prime * result + ((Format == null) ? 0 : Format.hashCode());
		result = prime * result + ((Format_Level == null) ? 0 : Format_Level.hashCode());
		result = prime * result + ((Format_Profile == null) ? 0 : Format_Profile.hashCode());
		result = prime * result + ((Format_Settings_CABAC == null) ? 0 : Format_Settings_CABAC.hashCode());
		result = prime * result + ((Format_Settings_RefFrames == null) ? 0 : Format_Settings_RefFrames.hashCode());
		result = prime * result + ((FrameCount == null) ? 0 : FrameCount.hashCode());
		result = prime * result + ((FrameRate == null) ? 0 : FrameRate.hashCode());
		result = prime * result + ((FrameRate_Mode == null) ? 0 : FrameRate_Mode.hashCode());
		result = prime * result + ((Height == null) ? 0 : Height.hashCode());
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((Language == null) ? 0 : Language.hashCode());
		result = prime * result + ((PixelAspectRatio == null) ? 0 : PixelAspectRatio.hashCode());
		result = prime * result + ((Sampled_Height == null) ? 0 : Sampled_Height.hashCode());
		result = prime * result + ((Sampled_Width == null) ? 0 : Sampled_Width.hashCode());
		result = prime * result + ((ScanType == null) ? 0 : ScanType.hashCode());
		result = prime * result + ((Stored_Height == null) ? 0 : Stored_Height.hashCode());
		result = prime * result + ((StreamOrder == null) ? 0 : StreamOrder.hashCode());
		result = prime * result + ((StreamSize == null) ? 0 : StreamSize.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + ((UniqueID == null) ? 0 : UniqueID.hashCode());
		result = prime * result + ((Width == null) ? 0 : Width.hashCode());
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
		VideoDTO other = (VideoDTO) obj;
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
		if (BitRate_Maximum == null) {
			if (other.BitRate_Maximum != null)
				return false;
		} else if (!BitRate_Maximum.equals(other.BitRate_Maximum))
			return false;
		if (BitRate_Mode == null) {
			if (other.BitRate_Mode != null)
				return false;
		} else if (!BitRate_Mode.equals(other.BitRate_Mode))
			return false;
		if (BufferSize == null) {
			if (other.BufferSize != null)
				return false;
		} else if (!BufferSize.equals(other.BufferSize))
			return false;
		if (ChromaSubsampling == null) {
			if (other.ChromaSubsampling != null)
				return false;
		} else if (!ChromaSubsampling.equals(other.ChromaSubsampling))
			return false;
		if (CodecID == null) {
			if (other.CodecID != null)
				return false;
		} else if (!CodecID.equals(other.CodecID))
			return false;
		if (ColorSpace == null) {
			if (other.ColorSpace != null)
				return false;
		} else if (!ColorSpace.equals(other.ColorSpace))
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
		if (DisplayAspectRatio == null) {
			if (other.DisplayAspectRatio != null)
				return false;
		} else if (!DisplayAspectRatio.equals(other.DisplayAspectRatio))
			return false;
		if (Duration == null) {
			if (other.Duration != null)
				return false;
		} else if (!Duration.equals(other.Duration))
			return false;
		if (Encoded_Library == null) {
			if (other.Encoded_Library != null)
				return false;
		} else if (!Encoded_Library.equals(other.Encoded_Library))
			return false;
		if (Encoded_Library_Name == null) {
			if (other.Encoded_Library_Name != null)
				return false;
		} else if (!Encoded_Library_Name.equals(other.Encoded_Library_Name))
			return false;
		if (Encoded_Library_Settings == null) {
			if (other.Encoded_Library_Settings != null)
				return false;
		} else if (!Encoded_Library_Settings.equals(other.Encoded_Library_Settings))
			return false;
		if (Encoded_Library_Version == null) {
			if (other.Encoded_Library_Version != null)
				return false;
		} else if (!Encoded_Library_Version.equals(other.Encoded_Library_Version))
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
		if (Format_Level == null) {
			if (other.Format_Level != null)
				return false;
		} else if (!Format_Level.equals(other.Format_Level))
			return false;
		if (Format_Profile == null) {
			if (other.Format_Profile != null)
				return false;
		} else if (!Format_Profile.equals(other.Format_Profile))
			return false;
		if (Format_Settings_CABAC == null) {
			if (other.Format_Settings_CABAC != null)
				return false;
		} else if (!Format_Settings_CABAC.equals(other.Format_Settings_CABAC))
			return false;
		if (Format_Settings_RefFrames == null) {
			if (other.Format_Settings_RefFrames != null)
				return false;
		} else if (!Format_Settings_RefFrames.equals(other.Format_Settings_RefFrames))
			return false;
		if (FrameCount == null) {
			if (other.FrameCount != null)
				return false;
		} else if (!FrameCount.equals(other.FrameCount))
			return false;
		if (FrameRate == null) {
			if (other.FrameRate != null)
				return false;
		} else if (!FrameRate.equals(other.FrameRate))
			return false;
		if (FrameRate_Mode == null) {
			if (other.FrameRate_Mode != null)
				return false;
		} else if (!FrameRate_Mode.equals(other.FrameRate_Mode))
			return false;
		if (Height == null) {
			if (other.Height != null)
				return false;
		} else if (!Height.equals(other.Height))
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
		if (PixelAspectRatio == null) {
			if (other.PixelAspectRatio != null)
				return false;
		} else if (!PixelAspectRatio.equals(other.PixelAspectRatio))
			return false;
		if (Sampled_Height == null) {
			if (other.Sampled_Height != null)
				return false;
		} else if (!Sampled_Height.equals(other.Sampled_Height))
			return false;
		if (Sampled_Width == null) {
			if (other.Sampled_Width != null)
				return false;
		} else if (!Sampled_Width.equals(other.Sampled_Width))
			return false;
		if (ScanType == null) {
			if (other.ScanType != null)
				return false;
		} else if (!ScanType.equals(other.ScanType))
			return false;
		if (Stored_Height == null) {
			if (other.Stored_Height != null)
				return false;
		} else if (!Stored_Height.equals(other.Stored_Height))
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
		if (Width == null) {
			if (other.Width != null)
				return false;
		} else if (!Width.equals(other.Width))
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
		return "VideoDTO [StreamOrder=" + StreamOrder + ", ID=" + ID + ", UniqueID=" + UniqueID + ", Format=" + Format
				+ ", Format_Profile=" + Format_Profile + ", Format_Level=" + Format_Level + ", Format_Settings_CABAC="
				+ Format_Settings_CABAC + ", Format_Settings_RefFrames=" + Format_Settings_RefFrames + ", CodecID="
				+ CodecID + ", Duration=" + Duration + ", BitRate_Mode=" + BitRate_Mode + ", BitRate=" + BitRate
				+ ", BitRate_Maximum=" + BitRate_Maximum + ", Width=" + Width + ", Height=" + Height
				+ ", Stored_Height=" + Stored_Height + ", Sampled_Width=" + Sampled_Width + ", Sampled_Height="
				+ Sampled_Height + ", PixelAspectRatio=" + PixelAspectRatio + ", DisplayAspectRatio="
				+ DisplayAspectRatio + ", FrameRate_Mode=" + FrameRate_Mode + ", FrameRate=" + FrameRate
				+ ", FrameCount=" + FrameCount + ", ColorSpace=" + ColorSpace + ", ChromaSubsampling="
				+ ChromaSubsampling + ", BitDepth=" + BitDepth + ", ScanType=" + ScanType + ", Delay=" + Delay
				+ ", StreamSize=" + StreamSize + ", Title=" + Title + ", Encoded_Library=" + Encoded_Library
				+ ", Encoded_Library_Name=" + Encoded_Library_Name + ", Encoded_Library_Version="
				+ Encoded_Library_Version + ", Encoded_Library_Settings=" + Encoded_Library_Settings + ", Language="
				+ Language + ", Default=" + Default + ", Forced=" + Forced + ", BufferSize=" + BufferSize + ", extra="
				+ extra + "]";
	}
}
