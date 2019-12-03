package mediainfo.data.enums;

import static mediainfo.data.Constantes.*;

public enum MediaInfoParameters 
{
	GENERAL_FILE_SIZE_BYTES("General","FileSize"),
	GENERAL_FILE_SIZE_CONVERTED("General","FileSize/String3"),
	GENERAL_FILE_NAME("General","FileName"),
	GENERAL_AUDIO_COUNT("General","AudioCount"),
	GENERAL_VIDEO_COUNT("General","VideoCount"),
	GENERAL_TEXT_COUNT("General","TextCount"),
	GENERAL_FILE_EXTENSION("General","FileExtension"),
	GENERAL_FORMAT_NAME("General",FORMAT_STRING),
	GENERAL_DURATION("General",DURATION_STRING3),
	
	AUDIO_STREAM_ORDER("Audio","StreamOrder"),
	AUDIO_ID("Audio","ID"),
	AUDIO_TITLE("Audio","Title"),
	AUDIO_LANGUAGE("Audio","Language"),
	AUDIO_FORMAT_NAME("Audio",FORMAT_STRING),
	AUDIO_DURATION("Audio",DURATION_STRING3),
	
	AUDIO_("Audio","")
	;
	
	private String propertieName;
	private String sectionName;

	private MediaInfoParameters(String sectionName, String propertieName) 
	{
		this.setSectionName(sectionName);
		this.setPropertieName(propertieName);
	}

	public String getPropertieName() {
		return propertieName;
	}

	private void setPropertieName(String propertieName) {
		this.propertieName = propertieName;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
}
