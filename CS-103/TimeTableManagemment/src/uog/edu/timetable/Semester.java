package uog.edu.timetable;

public class Semester 
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\Semester.csv";
	private int SEMESTER_ID;
	private String SEMESTER_CODE;
	private String SEMESTER_NAME;
	private String SEMESTER_STARTDATE;
	private String SEMESTER_ENDDATE;
	
	public int getSEMESTER_ID() 
	    {   return SEMESTER_ID;  }
	public void setSEMESTER_ID(int SEMESTER_id) {
		SEMESTER_ID = SEMESTER_id;
	}
	public String getSEMESTER_CODE() {
		return SEMESTER_CODE;
	}
	public void setSEMESTER_CODE(String SEMESTER_code) {
		SEMESTER_CODE = SEMESTER_code;
	}
	public String getSEMESTER_NAME() {
		return SEMESTER_NAME;
	}
	public void setSEMESTER_NAME(String SEMESTER_name) {
		SEMESTER_NAME = SEMESTER_name;
	}
	public String getSEMESTER_STARTDATE() {
		return SEMESTER_STARTDATE;
	}
	public void setSEMESTER_STARTDATE(String SEMESTER_startdate) {
		SEMESTER_STARTDATE = SEMESTER_startdate;
	}
	public String getSEMESTER_ENDDATE() {
		return SEMESTER_ENDDATE;
	}
	public void setSEMESTER_ENDDATE(String SEMESTER_enddate) {
		SEMESTER_ENDDATE = SEMESTER_enddate;
	}
	public String toString()
	{
		String str = null;
		       str = this.SEMESTER_ID
		     + "," + this.SEMESTER_CODE
	         + "," + this.SEMESTER_NAME
	         + "," + this.SEMESTER_STARTDATE
	         + "," + this.SEMESTER_ENDDATE;
		return str;
	}
}