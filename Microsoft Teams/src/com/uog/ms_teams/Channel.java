package com.uog.ms_teams;
public class Channel 
{
	private int CHANNEL_ID;
	private int PRIVACY_ID;
	private String CHANNEL_NAME;
	private String CHANNEL_DESC;
	private String CHANNEL_EMAIL;
	private String IS_PUBLIC;
	
	public int getCHANNEL_ID() 
	{
		return CHANNEL_ID;
	}
	public void setCHANNEL_ID(int CHANNEL_id) 
	{
		CHANNEL_ID = CHANNEL_id;
	}
	public int getPRIVACY_ID() 
	{
		return PRIVACY_ID;
	}
	public void setPRIVACY_ID(int PRIVACY_id) 
	{
		PRIVACY_ID = PRIVACY_id;
	}
	public String getCHANNEL_NAME() 
	{
		return CHANNEL_NAME;
	}
	public void setCHANNEL_NAME(String CHANNEL_name) 
	{
		CHANNEL_NAME = CHANNEL_name;
	}
	public String getCHANNEL_DESC() 
	{
		return CHANNEL_DESC;
	}
	public void setCHANNEL_DESC(String CHANNEL_desc) 
	{
		CHANNEL_DESC = CHANNEL_desc;
	}
	public String getCHANNEL_EMAIL() 
	{
		return CHANNEL_EMAIL;
	}
	public void setCHANNEL_EMAIL(String CHANNEL_email) 
	{
		CHANNEL_EMAIL = CHANNEL_email;
	}
	public String getIS_PUBLIC() 
	{
		return IS_PUBLIC;
	}
	public void setIS_PUBLIC(String IS_public) 
	{
		IS_PUBLIC = IS_public;
	}
}