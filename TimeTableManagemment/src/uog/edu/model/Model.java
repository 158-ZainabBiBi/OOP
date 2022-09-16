package uog.edu.model;
public class Model
{
    public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\Model.csv";
	private int MODEL_ID;
	private String WEEKDAY_NAME;
	private int TIMESLOT_No;
	private String TIMESLOT_TIME;
	private String COURSE_NAME;
	private String TEACHER_NAME;
	private String ROOM_NAME;
	private String BATCH_DETAILS;
	
	public int getMODEL_ID() 
	{
		return MODEL_ID;
	}
	public void setMODEL_ID(int mODEL_ID) 
	{
		MODEL_ID = mODEL_ID;
	}
	public String getWEEKDAY_NAME() 
	{
		return WEEKDAY_NAME;
	}
	public void setWEEKDAY_NAME(String wEEKDAY_NAME) 
	{
		WEEKDAY_NAME = wEEKDAY_NAME;
	}
	public int getTIMESLOT_No() 
	{
		return TIMESLOT_No;
	}
	public void setTIMESLOT_No(int tIMESLOT_No) 
	{
		TIMESLOT_No = tIMESLOT_No;
	}
	public String getTIMESLOT_TIME() 
	{
		return TIMESLOT_TIME;
	}
	public void setTIMESLOT_TIME(String tIMESLOT_TIME) 
	{
		TIMESLOT_TIME = tIMESLOT_TIME;
	}
	public String getCOURSE_NAME() 
	{
		return COURSE_NAME;
	}
	public void setCOURSE_NAME(String cOURSE_NAME) 
	{
		COURSE_NAME = cOURSE_NAME;
	}
	public String getTEACHER_NAME() 
	{
		return TEACHER_NAME;
	}
	public void setTEACHER_NAME(String tEACHER_NAME) 
	{
		TEACHER_NAME = tEACHER_NAME;
	}
	public String getROOM_NAME() 
	{
		return ROOM_NAME;
	}
	public void setROOM_NAME(String rOOM_NAME) 
	{
		ROOM_NAME = rOOM_NAME;
	}
	public String getBATCH_DETAILS() 
	{
		return BATCH_DETAILS;
	}
	public void setBATCH_DETAILS(String bATCH_DETAILS) 
	{
		BATCH_DETAILS = bATCH_DETAILS;
	}
	public String toString()
	{
		String str = null;
		       str = this.MODEL_ID
		     + "," + this.WEEKDAY_NAME
	         + "," + this.TIMESLOT_No
	         + "," + this.TIMESLOT_TIME
	         + "," + this.COURSE_NAME
	         + "," + this.TEACHER_NAME
	         + "," + this.ROOM_NAME
	         + "," + this.BATCH_DETAILS;
		return str;
	}
}
