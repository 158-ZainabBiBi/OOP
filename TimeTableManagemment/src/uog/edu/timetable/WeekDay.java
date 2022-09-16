package uog.edu.timetable;
public class WeekDay 
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\WeekDay.csv";
	private int WEEKDAY_ID;
    private String WEEKDAY_NAME;
    
	public int getWEEKDAY_ID() 
	{
		return WEEKDAY_ID;
	}
	public void setWEEKDAY_ID(int WEEKDAY_id) 
	{
		WEEKDAY_ID = WEEKDAY_id;
	}
	public String getWEEKDAY_NAME() 
	{
		return WEEKDAY_NAME;
	}
	public void setWEEKDAY_NAME(String WEEKDAY_name) 
	{
		WEEKDAY_NAME = WEEKDAY_name;
	}

	public String toString()
	{
		String str = null;
		       str = this.WEEKDAY_ID
	         + "," + this.WEEKDAY_NAME;
		return str;
	}
}