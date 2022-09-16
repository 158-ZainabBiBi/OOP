package com.uog.ms_teams;
public class TeamType 
{
	private int TEAMTYPE_ID;
	private String TEAMTYPE_NAME;
	private String TEAMTYPE_DESC;
	private String TEAMTYPE_ICON= "\"C:\\Users\\DeLL\\Desktop\\Microsoft Teams.png\"";
	private String TEAM_LINK;
	
	public int getTEAMTYPE_ID() 
	{
		return TEAMTYPE_ID;
	}
	public void setTEAMTYPE_ID(int TEAMTYPE_id) 
	{
		TEAMTYPE_ID = TEAMTYPE_id;
	}
	public String getTEAMTYPE_NAME() 
	{
		return TEAMTYPE_NAME;
	}
	public void setTEAMTYPE_NAME(String TEAMTYPE_name) 
	{
		TEAMTYPE_NAME = TEAMTYPE_name;
	}
	public String getTEAMTYPE_DESC() 
	{
		return TEAMTYPE_DESC;
	}
	public void setTEAMTYPE_DESC(String TEAMTYPE_desc) 
	{
		TEAMTYPE_DESC = TEAMTYPE_desc;
	}
	public String getTEAMTYPE_ICON() 
	{
		return TEAMTYPE_ICON;
	}
	public String getTEAM_LINK() 
	{
		return TEAM_LINK;
	}
	public void setTEAM_LINK(String TEAM_link) 
	{
		TEAM_LINK = TEAM_link;
	}
}
