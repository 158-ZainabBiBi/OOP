package uog.edu.course;
public class Course
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\Course.csv";
	private int COURSE_ID;
	private String COURSE_CODE;
    private String COURSE_TITLE;
    private String COURSE_DESC;
    private int COURSE_CREDITHOUR;
    private Course COURSEPREREQUIST_ID;
    
	public int getCOURSE_ID() 
    	{    return COURSE_ID;    }
	public void setCOURSE_ID(int COURSE_id) 
	    {    COURSE_ID = COURSE_id;    }
	public String getCOURSE_CODE() 
	    {    return COURSE_CODE;    }
	public void setCOURSE_CODE(String COURSE_code) 
	    {    COURSE_CODE = COURSE_code;    }  
	public String getCOURSE_TITLE() 
	    {    return COURSE_TITLE;    }
	public void setCOURSE_TITLE(String COURSE_title) 
    	{    COURSE_TITLE = COURSE_title;    }
	public String getCOURSE_DESC() 
	    {    return COURSE_DESC;    }
	public void setCOURSE_DESC(String COURSE_desc) 
	    {    COURSE_DESC = COURSE_desc;    }
	public int getCOURSE_CREDITHOUR() 
	    {    return COURSE_CREDITHOUR;    }
	public void setCOURSE_CREDITHOUR(int COURSE_credithour) 
	    {    COURSE_CREDITHOUR = COURSE_credithour;    }
	public Course getCOURSEPREREQUIST_ID() 
	    {    return COURSEPREREQUIST_ID;    }
	public void setCOURSEPREREQUIST_ID(Course COURSEPREREQUIST_id) 
    	{    COURSEPREREQUIST_ID = COURSEPREREQUIST_id;    }
	
	public String toString()
	{
		String str = null;
		       str = this.COURSE_ID
	         + "," + this.COURSE_CODE
	         + "," + this.COURSE_TITLE
	         + "," + this.COURSE_DESC
	         + "," + this.COURSE_CREDITHOUR
		     + "," + this.COURSEPREREQUIST_ID;
		return str;
	}
}