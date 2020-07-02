package uog.edu.timetable;
import uog.edu.person.Person;

public class TimeSlot extends Person
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\TimeSlot.csv";
	private int TIMESLOT_ID;
	private WeekDay WEEKDAY_ID;
	private String  TIMESLOT_START;
	private String  TIMESLOT_END;
	public int getTIMESLOT_ID() 
	{
		return TIMESLOT_ID;
	}
	public void setTIMESLOT_ID(int TIMESLOT_id) 
	{
		TIMESLOT_ID = TIMESLOT_id;
	}
	public WeekDay getWEEKDAY_ID() 
	{
		return WEEKDAY_ID;
	}
	public void setWEEKDAY_ID(WeekDay WEEKDAY_id) 
	{
		WEEKDAY_ID = WEEKDAY_id;
	}
	public String getTIMESLOT_START() 
	{
		return TIMESLOT_START;
	}
	public void setTIMESLOT_START(String TIMESLOT_start) 
	{
		TIMESLOT_START = TIMESLOT_start;
	}
	public String getTIMESLOT_END() 
	{
		return TIMESLOT_END;
	}
	public void setTIMESLOT_END(String TIMESLOT_end) 
	{
		TIMESLOT_END = TIMESLOT_end;
	}	

	public String toString()
	{
		String str = null;
		       str = this.TIMESLOT_ID
	         + "," + this.WEEKDAY_ID
	         + "," + this.TIMESLOT_START
	         + "," + this.TIMESLOT_END;
		return str;
	}
}