package com.uog.ms_teams;
public class Team 
{
	private int TEAM_ID;
	private int TEAMTYPE_ID;
	private String TEAM_NAME;
	private String TEAM_DESC;
	private String TEAM_IMAGE= "\"C:\\Users\\DeLL\\Desktop\\Microsoft Teams.png\"";
	private String TEAM_CODE;
	
	public int getTEAM_ID() 
	{
		return TEAM_ID;
	}
	public void setTEAM_ID(int TEAM_id) 
	{
		TEAM_ID = TEAM_id;
	}
	public int getTEAMTYPE_ID() 
	{
		return TEAMTYPE_ID;
	}
	public void setTEAMTYPE_ID(int TEAMTYPE_id) 
	{
		TEAMTYPE_ID = TEAMTYPE_id;
	}
	public String getTEAM_NAME() 
	{
		return TEAM_NAME;
	}
	public void setTEAM_NAME(String TEAM_name) 
	{
		TEAM_NAME = TEAM_name;
	}
	public String getTEAM_DESC() 
	{
		return TEAM_DESC;
	}
	public void setTEAM_DESC(String TEAM_desc) 
	{
		TEAM_DESC = TEAM_desc;
	}
	public String getTEAM_IMAGE() 
	{
		return TEAM_IMAGE;
	}
	public String getTEAM_CODE() 
	{
		return TEAM_CODE;
	}
	public void setTEAM_CODE(String TEAM_code) 
	{
		TEAM_CODE = TEAM_code;
	}
}