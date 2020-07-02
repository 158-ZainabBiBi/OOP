package uog.edu.student;
import uog.edu.course.Course;
import uog.edu.timetable.Semester;
public class StudentCourse
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\StudentCourse.csv";
	 private int STUDENTCOURSE_ID;
	 private Student STUDENT_ID;
	 private String SECTION;
	 private Course COURSE_ID;
	 private Semester SEMESTER_ID;
	 
	 public int getSTUDENTCOURSE_ID() 
	 {    return STUDENTCOURSE_ID;    }
	 public void setSTUDENTCOURSE_ID(int STUDENTCOURSE_id) 
	 {    STUDENTCOURSE_ID = STUDENTCOURSE_id;    }
	 public Course getCOURSE_ID() 
	 {    return COURSE_ID;    }
	 public void setCOURSE_ID(Course COURSE_id) 
	 {    COURSE_ID = COURSE_id;   }
	 public Student getSTUDENT_ID() 
	 {    return STUDENT_ID;    }
	 public void setSTUDENT_ID(Student STUDENT_id) 
	 {    STUDENT_ID = STUDENT_id;   }
	public String getSECTION() 
	{     return SECTION;   }
	public void setSECTION(String Section) 
	{     SECTION = Section;   }
	public Semester getSEMESTER_ID() 
	{     return SEMESTER_ID;  }
	public void setSEMESTER_ID(Semester SEMESTER_id) 
	{     SEMESTER_ID = SEMESTER_id;   }
	
	public String toString()
	{
		String str = null;
		       str = this.STUDENTCOURSE_ID
		     + "," + this.STUDENT_ID
			 + "," + this.SECTION
			 + "," + this.COURSE_ID
	         + "," + this.SEMESTER_ID;
		return str;
	}
	
}