package com.uog.ms_teams;
public class TeamMember 
{
	private int TEAM_ID;
	private int USER_ID;
	private int TEAMMEMBERROLE_ID;
	private String TEAMMEMBERREQUEST_ACCEPTED;
	
	public int getTEAM_ID() 
	{
		return TEAM_ID;
	}
	public void setTEAM_ID(int TEAM_id) 
	{
		TEAM_ID = TEAM_id;
	}
	public int getUSER_ID() 
	{
		return USER_ID;
	}
	public void setUSER_ID(int USER_id) 
	{
		USER_ID = USER_id;
	}
	public int getTEAMMEMBERROLE_ID() 
	{
		return TEAMMEMBERROLE_ID;
	}
	public void setTEAMMEMBERROLE_ID(int TEAMMEMBERROLE_id) 
	{
		TEAMMEMBERROLE_ID = TEAMMEMBERROLE_id;
	}
	public String getTEAMMEMBERREQUEST_ACCEPTED() 
	{
		return TEAMMEMBERREQUEST_ACCEPTED;
	}
	public void setTEAMMEMBERREQUEST_ACCEPTED(String TEAMMEMBERREQUEST_accepted) 
	{
		TEAMMEMBERREQUEST_ACCEPTED = TEAMMEMBERREQUEST_accepted;
	}
}