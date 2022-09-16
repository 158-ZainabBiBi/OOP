package uog.edu.person;
public class Person 
{
	public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\Person.csv";
	private int PERSON_ID;
	private String FORE_NAME;
	private String SUR_NAME;
	private int AGE;
	private String GENDER;
	private String ADDRESS;
	
	public Person() {
		super();
	}
	public Person( String Fore_Name, String Sur_Name, int Age, String Gender,
			String Address) 
	{
		super();
		FORE_NAME = Fore_Name;
		SUR_NAME = Sur_Name;
		AGE = Age;
		GENDER = Gender;
		ADDRESS = Address;
	}
	
	public int getPERSON_ID() 
	{    return PERSON_ID;    }
	public void setPERSON_ID(int PERSON_id) 
	{    PERSON_ID = PERSON_id;    }
	public String getFORE_NAME() 
	{    return FORE_NAME;    }
	public void setFORE_NAME(String Fore_Name) 
	{    FORE_NAME = Fore_Name;    }
	public String getSUR_NAME() 
	{    return SUR_NAME;    }
	public void setSUR_NAME(String Sur_Name) 
	{    SUR_NAME = Sur_Name;    }
	public int getAGE() 
	{    return AGE;   }
	public void setAGE(int Age) 
	{    AGE = Age;    }
	public String getGENDER() 
	{    return GENDER;    }
	public void setGENDER(String Gender) 
	{    GENDER = Gender;    }
	public String getADDRESS() 
	{    return ADDRESS;    }
	public void setADDRESS(String Address) 
	{    ADDRESS = Address;    }
	
	public String toString()
	{
		String str = null;
		       str = this.PERSON_ID
	         + "," + this.FORE_NAME
	         + "," + this.SUR_NAME
	         + "," + this.AGE
	         + "," + this.GENDER
		     + "," + this.ADDRESS;
		return str;
	}
}