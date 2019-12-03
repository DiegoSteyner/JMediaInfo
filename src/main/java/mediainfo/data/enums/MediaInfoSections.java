package mediainfo.data.enums;

public enum MediaInfoSections 
{
	SECTION_GERAL("General"),
	SECTION_AUDIO("Audio"),
	SECTION_VIDEO("Video"),
	SECTION_TEXT("Text");
	
	private String sectionName;

	private MediaInfoSections(String sectionName) 
	{
		this.setSectionName(sectionName);
	}

	public String getSectionName() {
		return sectionName;
	}

	private void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
}
