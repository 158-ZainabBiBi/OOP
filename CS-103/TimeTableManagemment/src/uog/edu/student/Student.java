package uog.edu.student;
import uog.edu.person.Person;
public class Student
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\Student.csv";
	private int STUDENT_ID;
	private String STUDENT_ROLLNO;
	private Person PERSON_ID;
	private String STUDY_PROGRAM;
	private int STUDY_YEAR;
	
	public int getSTUDENT_ID() 
	    {    return STUDENT_ID;    }
	public void setSTUDENT_ID(int sTUDENT_ID) 
	    {    STUDENT_ID = sTUDENT_ID;    }
	public String getSTUDENT_ROLLNO() 
	    {    return STUDENT_ROLLNO;    }
	public void setSTUDENT_ROLLNO(String STUDENT_rollno) 
	    {    STUDENT_ROLLNO = STUDENT_rollno;    }
	public String getSTUDY_PROGRAM() 
    	{    return STUDY_PROGRAM;    }
	public void setSTUDY_PROGRAM(String STUDY_program) 
    	{    STUDY_PROGRAM = STUDY_program;    }
	public int getSTUDY_YEAR() 
	    {    return STUDY_YEAR;    }
	public void setSTUDY_YEAR(int STUDY_year) 
	    {    STUDY_YEAR = STUDY_year;    }
	public Person getPERSON_ID() 
	    {    return PERSON_ID;    }
	public void setPERSON_ID(Person pERSON_ID)
	{
		PERSON_ID = pERSON_ID;
	}
	public String toString()
	{
		String str = null;
		       str = this.STUDENT_ID	   
	         + "," + this.STUDENT_ROLLNO
	         + "," + this.PERSON_ID
	         + "," + this.STUDY_PROGRAM
	         + "," + this.STUDY_YEAR;
		return str;
	}
}