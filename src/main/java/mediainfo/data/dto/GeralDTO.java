package mediainfo.data.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="track")
@XmlAccessorType(XmlAccessType.FIELD)
public class GeralDTO extends MediaDTO implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String UniqueID;
	private String VideoCount;
	private String AudioCount;
	private String TextCount;
	private String FileExtension;
	private String Format;
	private String Format_Version;
	private String FileSize;
	private String Duration;
	private String OverallBitRate_Mode;
	private String OverallBitRate;
	private String FrameRate;
	private String FrameCount;
	private String StreamSize;
	private String IsStreamable;
	private String Title;
	private String Movie;
	private String Encoded_Date;
	private String File_Created_Date;
	private String File_Created_Date_Local;
	private String File_Modified_Date;
	private String File_Modified_Date_Local;
	private String Encoded_Application;
	private String Encoded_Library;
	private String simpleFileName;
	private String completeFileName;
	private String filePath;
	public String getUniqueID() {
		return UniqueID;
	}
	public void setUniqueID(String uniqueID) {
		UniqueID = uniqueID;
	}
	public String getVideoCount() {
		return VideoCount;
	}
	public void setVideoCount(String videoCount) {
		VideoCount = videoCount;
	}
	public String getAudioCount() {
		return AudioCount;
	}
	public void setAudioCount(String audioCount) {
		AudioCount = audioCount;
	}
	public String getTextCount() {
		return TextCount;
	}
	public void setTextCount(String textCount) {
		TextCount = textCount;
	}
	public String getFileExtension() {
		return FileExtension;
	}
	public void setFileExtension(String fileExtension) {
		FileExtension = fileExtension;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	public String getFormat_Version() {
		return Format_Version;
	}
	public void setFormat_Version(String format_Version) {
		Format_Version = format_Version;
	}
	public String getFileSize() {
		return FileSize;
	}
	public void setFileSize(String fileSize) {
		FileSize = fileSize;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getOverallBitRate_Mode() {
		return OverallBitRate_Mode;
	}
	public void setOverallBitRate_Mode(String overallBitRate_Mode) {
		OverallBitRate_Mode = overallBitRate_Mode;
	}
	public String getOverallBitRate() {
		return OverallBitRate;
	}
	public void setOverallBitRate(String overallBitRate) {
		OverallBitRate = overallBitRate;
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
	public String getStreamSize() {
		return StreamSize;
	}
	public void setStreamSize(String streamSize) {
		StreamSize = streamSize;
	}
	public String getIsStreamable() {
		return IsStreamable;
	}
	public void setIsStreamable(String isStreamable) {
		IsStreamable = isStreamable;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getMovie() {
		return Movie;
	}
	public void setMovie(String movie) {
		Movie = movie;
	}
	public String getEncoded_Date() {
		return Encoded_Date;
	}
	public void setEncoded_Date(String encoded_Date) {
		Encoded_Date = encoded_Date;
	}
	public String getFile_Created_Date() {
		return File_Created_Date;
	}
	public void setFile_Created_Date(String file_Created_Date) {
		File_Created_Date = file_Created_Date;
	}
	public String getFile_Created_Date_Local() {
		return File_Created_Date_Local;
	}
	public void setFile_Created_Date_Local(String file_Created_Date_Local) {
		File_Created_Date_Local = file_Created_Date_Local;
	}
	public String getFile_Modified_Date() {
		return File_Modified_Date;
	}
	public void setFile_Modified_Date(String file_Modified_Date) {
		File_Modified_Date = file_Modified_Date;
	}
	public String getFile_Modified_Date_Local() {
		return File_Modified_Date_Local;
	}
	public void setFile_Modified_Date_Local(String file_Modified_Date_Local) {
		File_Modified_Date_Local = file_Modified_Date_Local;
	}
	public String getEncoded_Application() {
		return Encoded_Application;
	}
	public void setEncoded_Application(String encoded_Application) {
		Encoded_Application = encoded_Application;
	}
	public String getEncoded_Library() {
		return Encoded_Library;
	}
	public void setEncoded_Library(String encoded_Library) {
		Encoded_Library = encoded_Library;
	}
	public String getSimpleFileName() {
		return simpleFileName;
	}
	public void setSimpleFileName(String simpleFileName) {
		this.simpleFileName = simpleFileName;
	}
	public String getCompleteFileName() {
		return completeFileName;
	}
	public void setCompleteFileName(String completeFileName) {
		this.completeFileName = completeFileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AudioCount == null) ? 0 : AudioCount.hashCode());
		result = prime * result + ((Duration == null) ? 0 : Duration.hashCode());
		result = prime * result + ((Encoded_Application == null) ? 0 : Encoded_Application.hashCode());
		result = prime * result + ((Encoded_Date == null) ? 0 : Encoded_Date.hashCode());
		result = prime * result + ((Encoded_Library == null) ? 0 : Encoded_Library.hashCode());
		result = prime * result + ((FileExtension == null) ? 0 : FileExtension.hashCode());
		result = prime * result + ((FileSize == null) ? 0 : FileSize.hashCode());
		result = prime * result + ((File_Created_Date == null) ? 0 : File_Created_Date.hashCode());
		result = prime * result + ((File_Created_Date_Local == null) ? 0 : File_Created_Date_Local.hashCode());
		result = prime * result + ((File_Modified_Date == null) ? 0 : File_Modified_Date.hashCode());
		result = prime * result + ((File_Modified_Date_Local == null) ? 0 : File_Modified_Date_Local.hashCode());
		result = prime * result + ((Format == null) ? 0 : Format.hashCode());
		result = prime * result + ((Format_Version == null) ? 0 : Format_Version.hashCode());
		result = prime * result + ((FrameCount == null) ? 0 : FrameCount.hashCode());
		result = prime * result + ((FrameRate == null) ? 0 : FrameRate.hashCode());
		result = prime * result + ((IsStreamable == null) ? 0 : IsStreamable.hashCode());
		result = prime * result + ((Movie == null) ? 0 : Movie.hashCode());
		result = prime * result + ((OverallBitRate == null) ? 0 : OverallBitRate.hashCode());
		result = prime * result + ((OverallBitRate_Mode == null) ? 0 : OverallBitRate_Mode.hashCode());
		result = prime * result + ((StreamSize == null) ? 0 : StreamSize.hashCode());
		result = prime * result + ((TextCount == null) ? 0 : TextCount.hashCode());
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + ((UniqueID == null) ? 0 : UniqueID.hashCode());
		result = prime * result + ((VideoCount == null) ? 0 : VideoCount.hashCode());
		result = prime * result + ((completeFileName == null) ? 0 : completeFileName.hashCode());
		result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + ((simpleFileName == null) ? 0 : simpleFileName.hashCode());
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
		GeralDTO other = (GeralDTO) obj;
		if (AudioCount == null) {
			if (other.AudioCount != null)
				return false;
		} else if (!AudioCount.equals(other.AudioCount))
			return false;
		if (Duration == null) {
			if (other.Duration != null)
				return false;
		} else if (!Duration.equals(other.Duration))
			return false;
		if (Encoded_Application == null) {
			if (other.Encoded_Application != null)
				return false;
		} else if (!Encoded_Application.equals(other.Encoded_Application))
			return false;
		if (Encoded_Date == null) {
			if (other.Encoded_Date != null)
				return false;
		} else if (!Encoded_Date.equals(other.Encoded_Date))
			return false;
		if (Encoded_Library == null) {
			if (other.Encoded_Library != null)
				return false;
		} else if (!Encoded_Library.equals(other.Encoded_Library))
			return false;
		if (FileExtension == null) {
			if (other.FileExtension != null)
				return false;
		} else if (!FileExtension.equals(other.FileExtension))
			return false;
		if (FileSize == null) {
			if (other.FileSize != null)
				return false;
		} else if (!FileSize.equals(other.FileSize))
			return false;
		if (File_Created_Date == null) {
			if (other.File_Created_Date != null)
				return false;
		} else if (!File_Created_Date.equals(other.File_Created_Date))
			return false;
		if (File_Created_Date_Local == null) {
			if (other.File_Created_Date_Local != null)
				return false;
		} else if (!File_Created_Date_Local.equals(other.File_Created_Date_Local))
			return false;
		if (File_Modified_Date == null) {
			if (other.File_Modified_Date != null)
				return false;
		} else if (!File_Modified_Date.equals(other.File_Modified_Date))
			return false;
		if (File_Modified_Date_Local == null) {
			if (other.File_Modified_Date_Local != null)
				return false;
		} else if (!File_Modified_Date_Local.equals(other.File_Modified_Date_Local))
			return false;
		if (Format == null) {
			if (other.Format != null)
				return false;
		} else if (!Format.equals(other.Format))
			return false;
		if (Format_Version == null) {
			if (other.Format_Version != null)
				return false;
		} else if (!Format_Version.equals(other.Format_Version))
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
		if (IsStreamable == null) {
			if (other.IsStreamable != null)
				return false;
		} else if (!IsStreamable.equals(other.IsStreamable))
			return false;
		if (Movie == null) {
			if (other.Movie != null)
				return false;
		} else if (!Movie.equals(other.Movie))
			return false;
		if (OverallBitRate == null) {
			if (other.OverallBitRate != null)
				return false;
		} else if (!OverallBitRate.equals(other.OverallBitRate))
			return false;
		if (OverallBitRate_Mode == null) {
			if (other.OverallBitRate_Mode != null)
				return false;
		} else if (!OverallBitRate_Mode.equals(other.OverallBitRate_Mode))
			return false;
		if (StreamSize == null) {
			if (other.StreamSize != null)
				return false;
		} else if (!StreamSize.equals(other.StreamSize))
			return false;
		if (TextCount == null) {
			if (other.TextCount != null)
				return false;
		} else if (!TextCount.equals(other.TextCount))
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
		if (VideoCount == null) {
			if (other.VideoCount != null)
				return false;
		} else if (!VideoCount.equals(other.VideoCount))
			return false;
		if (completeFileName == null) {
			if (other.completeFileName != null)
				return false;
		} else if (!completeFileName.equals(other.completeFileName))
			return false;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		if (simpleFileName == null) {
			if (other.simpleFileName != null)
				return false;
		} else if (!simpleFileName.equals(other.simpleFileName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GeralDTO [UniqueID=" + UniqueID + ", VideoCount=" + VideoCount + ", AudioCount=" + AudioCount
				+ ", TextCount=" + TextCount + ", FileExtension=" + FileExtension + ", Format=" + Format
				+ ", Format_Version=" + Format_Version + ", FileSize=" + FileSize + ", Duration=" + Duration
				+ ", OverallBitRate_Mode=" + OverallBitRate_Mode + ", OverallBitRate=" + OverallBitRate + ", FrameRate="
				+ FrameRate + ", FrameCount=" + FrameCount + ", StreamSize=" + StreamSize + ", IsStreamable="
				+ IsStreamable + ", Title=" + Title + ", Movie=" + Movie + ", Encoded_Date=" + Encoded_Date
				+ ", File_Created_Date=" + File_Created_Date + ", File_Created_Date_Local=" + File_Created_Date_Local
				+ ", File_Modified_Date=" + File_Modified_Date + ", File_Modified_Date_Local="
				+ File_Modified_Date_Local + ", Encoded_Application=" + Encoded_Application + ", Encoded_Library="
				+ Encoded_Library + ", simpleFileName=" + simpleFileName + ", completeFileName=" + completeFileName
				+ ", filePath=" + filePath + "]";
	}
}
