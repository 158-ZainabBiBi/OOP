package uog.edu.timetable;
import uog.edu.campus.Room;
import uog.edu.campus.RoomData;
import uog.edu.teacher.TeacherCourse;
import uog.edu.teacher.TeacherCourseData;
public class TimeTable
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\TimeTable.csv";
	private int TIMETABLE_ID;
    private TeacherCourse TEACHERCOURSE_ID;
    private TimeSlot TIMESLOT_ID;
    private Room ROOM_ID;
    private Semester SEMESTER_ID;
    
	public int getTIMETABLE_ID() 
	{
		return TIMETABLE_ID;
	}
	public void setTIMETABLE_ID(int TIMETABLE_id) 
	{
		TIMETABLE_ID = TIMETABLE_id;
	}
	public TeacherCourse getTEACHERCOURSE_ID() 
	{
		return TEACHERCOURSE_ID;
	}
	public void setTEACHERCOURSE_ID(TeacherCourse TEACHERCOURSE_id) 
	{
		TEACHERCOURSE_ID = TEACHERCOURSE_id;
	}
	public TimeSlot getTIMESLOT_ID() 
	{
		return TIMESLOT_ID;
	}
	public void setTIMESLOT_ID(TimeSlot TIMESLOT_id) 
	{
		TIMESLOT_ID = TIMESLOT_id;
	}
	public Room getROOM_ID() 
	{
		return ROOM_ID;
	}
	public void setROOM_ID(Room ROOM_id) 
	{
		ROOM_ID = ROOM_id;
	}
	public Semester getSEMESTER_ID() {
		return SEMESTER_ID;
	}
	public void setSEMESTER_ID(Semester SEMESTER_id) {
		SEMESTER_ID = SEMESTER_id;
	}
	public String toString()
	{
		String str = null;
		       str = this.TIMETABLE_ID
	         + "," + this.TIMESLOT_ID
	         + "," + this.TEACHERCOURSE_ID
	         + "," + this.ROOM_ID
	         + "," + this.SEMESTER_ID;
		return str;
	}

	
}