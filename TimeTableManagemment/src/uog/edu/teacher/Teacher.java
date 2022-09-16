package uog.edu.teacher;
import uog.edu.person.Person;
public class Teacher
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\Teacher.csv";
    private int TEACHER_ID;
    private Person PERSON_ID;
    private String TEACHER_GRADE;
    
	public int getTEACHER_ID() 
	{
		return TEACHER_ID;
	}
	public void setTEACHER_ID(int TEACHER_id) 
	{
		TEACHER_ID = TEACHER_id;
	}
	public String getTEACHER_GRADE() 
	{
		return TEACHER_GRADE;
	}
	public void setTEACHER_GRADE(String TEACHER_grade) 
	{
		TEACHER_GRADE = TEACHER_grade;
	}
	public Person getPERSON_ID() 
    {    return PERSON_ID;    }
    public void setPERSON_ID(Person pERSON_ID)
    {    PERSON_ID = pERSON_ID;    }
    
	public String toString()
	{
		String str = null;
		       str = this.TEACHER_ID
		  	 + "," + this.PERSON_ID    		   
	         + "," + this.TEACHER_GRADE;
		return str;
	}
}