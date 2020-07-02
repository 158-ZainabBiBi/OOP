package uog.edu.teacher;
import uog.edu.course.Course;
import uog.edu.person.Person;
import uog.edu.timetable.Semester;

public class TeacherCourse extends Person
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\TeacherCourse.csv";
    private int TEACHERCOURSE_ID;
    private Teacher TEACHER_ID;
	 private String SECTION;
	 private Course COURSE_ID;
	 private Semester SEMESTER_ID;
    
	public int getTEACHERCOURSE_ID() 
	{
		return TEACHERCOURSE_ID;
	}
	public void setTEACHERCOURSE_ID(int TEACHERCOURSE_id) 
	{
		TEACHERCOURSE_ID = TEACHERCOURSE_id;
	}
	public Course getCOURSE_ID() 
	{
		return COURSE_ID;
	}
	public void setCOURSE_ID(Course COURSE_id) 
	{
		COURSE_ID = COURSE_id;
	}
	public Teacher getTEACHER_ID() 
	{
		return TEACHER_ID;
	}
	public void setTEACHER_ID(Teacher TEACHER_id) 
	{
		TEACHER_ID = TEACHER_id;
	}
	public String getSECTION() 
	{
		return SECTION;
	}
	public void setSECTION(String Section) 
	{
		SECTION = Section;
	}
	public Semester getSEMESTER_ID() 
	{
		return SEMESTER_ID;
	}
	public void setSEMESTER_ID(Semester sEMESTER_ID) 
	{
		SEMESTER_ID = sEMESTER_ID;
	}
	public String toString()
	{
		String str = null;
		       str = this.TEACHERCOURSE_ID
	         + "," + this.TEACHER_ID
			 + "," + this.SECTION
			 + "," + this.COURSE_ID
	         + "," + this.SEMESTER_ID;
		return str;
	}
}