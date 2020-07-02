package uog.edu.person;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import uog.edu.course.Course;
import uog.edu.course.CourseData;
import uog.edu.student.Student;
import uog.edu.student.StudentData;
@SuppressWarnings("unused")
public class PersonData 
{
	@SuppressWarnings("resource")
	public static List<Person> FindAll()
	{
		List<Person> persons = new ArrayList<Person>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Person.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				Person person=new Person();
				String[] personrow = line.split(",");
				person.setPERSON_ID(Integer.parseInt(personrow[0]));
		    	person.setFORE_NAME(personrow[1]);
			    person.setSUR_NAME(personrow[2]);
		    	person.setAGE(Integer.parseInt(personrow[3]));
		    	person.setGENDER(personrow[4]);
		    	person.setADDRESS(personrow[5]);
				persons.add(person);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return persons;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static Person Search(int student_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Person.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				PersonData persons = new PersonData();
				String[] personrow = line.split(",");		
				if (Integer.parseInt(personrow[0]) == student_id) 
				{
					Person person=new Person();
					person.setPERSON_ID(Integer.parseInt(personrow[0]));
			    	person.setFORE_NAME(personrow[1]);
				    person.setSUR_NAME(personrow[2]);
			    	person.setAGE(Integer.parseInt(personrow[3]));
			    	person.setGENDER(personrow[4]);
			    	person.setADDRESS(personrow[5]);
					return person;
				}
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return null;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Person> Search2(String fore_name)
	{
		List<Person> persons = new ArrayList<Person>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Person.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Person person=new Person();
				String[] personrow = line.split(",");
				if(personrow[2].contains(fore_name)== true)
				{
					person.setPERSON_ID(Integer.parseInt(personrow[0]));
			    	person.setFORE_NAME(personrow[1]);
				    person.setSUR_NAME(personrow[2]);
			    	person.setAGE(Integer.parseInt(personrow[3]));
			    	person.setGENDER(personrow[4]);
			    	person.setADDRESS(personrow[5]);
			    	persons.add(person);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return persons;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Person> Search3(String sur_name)
	{
		List<Person> persons = new ArrayList<Person>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Person.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Person person=new Person();
				String[] personrow = line.split(",");
				if(personrow[2].contains(sur_name)== true)
				{
					person.setPERSON_ID(Integer.parseInt(personrow[0]));
			    	person.setFORE_NAME(personrow[1]);
				    person.setSUR_NAME(personrow[2]);
			    	person.setAGE(Integer.parseInt(personrow[3]));
			    	person.setGENDER(personrow[4]);
			    	person.setADDRESS(personrow[5]);
			    	persons.add(person);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return persons;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static Person Search4(int age)  
	{
		String line;
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Person.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				PersonData persons = new PersonData();
				String[] personrow = line.split(",");		
				if ((Integer.parseInt(personrow[3]) == age) == true)
				{
					Person person=new Person();
					person.setPERSON_ID(Integer.parseInt(personrow[0]));
			    	person.setFORE_NAME(personrow[1]);
				    person.setSUR_NAME(personrow[2]);
			    	person.setAGE(Integer.parseInt(personrow[3]));
			    	person.setGENDER(personrow[4]);
			    	person.setADDRESS(personrow[5]);
					return person;
				}
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return null;
	}
////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Person> Search5(String gender)
	{
		List<Person> persons = new ArrayList<Person>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Person.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Person person=new Person();
				String[] personrow = line.split(",");
				if(personrow[5].contains(gender)== true)
				{
					person.setPERSON_ID(Integer.parseInt(personrow[0]));
			    	person.setFORE_NAME(personrow[1]);
				    person.setSUR_NAME(personrow[2]);
			    	person.setAGE(Integer.parseInt(personrow[3]));
			    	person.setGENDER(personrow[4]);
			    	person.setADDRESS(personrow[5]);
			    	persons.add(person);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return persons;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Person> Search6(String address)
	{
		List<Person> persons = new ArrayList<Person>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Person.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Person person=new Person();
				String[] personrow = line.split(",");
				if(personrow[6].contains(address)== true)
				{
					person.setPERSON_ID(Integer.parseInt(personrow[0]));
			    	person.setFORE_NAME(personrow[1]);
				    person.setSUR_NAME(personrow[2]);
			    	person.setAGE(Integer.parseInt(personrow[3]));
			    	person.setGENDER(personrow[4]);
			    	person.setADDRESS(personrow[5]);
			    	persons.add(person);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return persons;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////

	@SuppressWarnings({ "resource", "static-access" })
	public static  Person Save(Person person)
	{
		FileWriter filewriter;
        List<Person> persons = FindAll();
		try 
		{
			filewriter = new FileWriter(Person.csvFile);
			for(int i=0; i<persons.size(); i++)
			{
				filewriter.append(persons.get(i).toString());
				filewriter.append("\n");
			}
			if(persons.size()>0)
			   {  person.setPERSON_ID(persons.get(persons.size()-1).getPERSON_ID()+1);  }
			else
			   {  person.setPERSON_ID(1);  }
			persons.add(person);
			filewriter.append(person.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return person;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<Person> persons = FindAll();
		try 
		{
			filewriter = new FileWriter(Person.csvFile);
			
			for(int i=0;i<persons.size();i++) 
			{
				persons.remove(i);
			}
				filewriter.flush();
				filewriter.close();
	    } 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return "Removed Successfully";
	}
    public static Person DelOne(int person_ID) 
    {
		FileWriter filewriter;
		List<Person> persons = FindAll();
		Person person = PersonData.Search(person_ID);
		try 
		{
			filewriter = new FileWriter(Person.csvFile);
			for(int i=0;i<persons.size();i++) 
			{
				if(persons.get(i).getPERSON_ID()!=person_ID)
				{
					filewriter.append(persons.get(i).toString());
					filewriter.append("\n");
				}
			}
			    filewriter.flush();
				filewriter.close();
	    } 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return person;
	}
}