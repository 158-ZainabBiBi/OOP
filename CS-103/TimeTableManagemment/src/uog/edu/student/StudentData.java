package uog.edu.student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import uog.edu.course.Course;
import uog.edu.course.CourseData;
import uog.edu.person.PersonData;
import uog.edu.student.Student;
import uog.edu.student.StudentData;
@SuppressWarnings("unused")
public class StudentData 
{
	@SuppressWarnings("resource")
	public static List<Student> FindAll()
	{
		List<Student> students = new ArrayList<Student>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Student.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				Student student=new Student();
				String[] studentrow = line.split(",");
				student.setSTUDENT_ID(Integer.parseInt(studentrow[0]));
				student.setSTUDENT_ROLLNO(studentrow[1]);
				student.setPERSON_ID(PersonData.Search(Integer.parseInt(studentrow[2])));
				student.setSTUDY_PROGRAM(studentrow[3]);
			    student.setSTUDY_YEAR(Integer.parseInt(studentrow[4]));	
				students.add(student);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return students;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static Student Search(int student_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				StudentData students = new StudentData();
				String[] studentrow = line.split(",");		
				if (Integer.parseInt(studentrow[0]) == student_id) 
				{
					Student student=new Student();
					student.setSTUDENT_ID(Integer.parseInt(studentrow[0]));
					student.setSTUDENT_ROLLNO(studentrow[1]);
					student.setPERSON_ID(PersonData.Search(Integer.parseInt(studentrow[2])));
					student.setSTUDY_PROGRAM(studentrow[3]);
				    student.setSTUDY_YEAR(Integer.parseInt(studentrow[4]));		
					return student;
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
	@SuppressWarnings("resource")
	public static Student Search1(int rollno)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				StudentData students = new StudentData();
				String[] studentrow = line.split(",");		
				if (Integer.parseInt(studentrow[1]) == rollno) 
				{
					Student student=new Student();
					student.setSTUDENT_ID(Integer.parseInt(studentrow[0]));
					student.setSTUDENT_ROLLNO(studentrow[1]);
					student.setPERSON_ID(PersonData.Search(Integer.parseInt(studentrow[2])));
					student.setSTUDY_PROGRAM(studentrow[3]);
				    student.setSTUDY_YEAR(Integer.parseInt(studentrow[4]));		
					return student;
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
	public static List<Student> Search2(String study_program)
	{
		List<Student> students = new ArrayList<Student>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Student.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Student student=new Student();
				String[] studentrow = line.split(",");
				if(studentrow[3].contains(study_program)== true)
				{
					student.setSTUDENT_ID(Integer.parseInt(studentrow[0]));
					student.setSTUDENT_ROLLNO(studentrow[1]);
					student.setPERSON_ID(PersonData.Search(Integer.parseInt(studentrow[2])));
					student.setSTUDY_PROGRAM(studentrow[3]);
				    student.setSTUDY_YEAR(Integer.parseInt(studentrow[4]));	
			    	students.add(student);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return students;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static Student Search3(int study_year)  
	{
		String line;
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Student.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				StudentData students = new StudentData();
				String[] studentrow = line.split(",");		
				if (Integer.parseInt(studentrow[4]) == study_year) 
				{
					Student student=new Student();
					student.setSTUDENT_ID(Integer.parseInt(studentrow[0]));
					student.setSTUDENT_ROLLNO(studentrow[1]);
					student.setPERSON_ID(PersonData.Search(Integer.parseInt(studentrow[2])));
					student.setSTUDY_PROGRAM(studentrow[3]);
				    student.setSTUDY_YEAR(Integer.parseInt(studentrow[4]));		
					return student;
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
	@SuppressWarnings({ "resource", "static-access" })
	public static  Student Save(Student student)
	{
		FileWriter filewriter;
        List<Student> students = FindAll();
		try 
		{
			filewriter = new FileWriter(Student.csvFile);
			for(int i=0; i<students.size(); i++)
			{
				filewriter.append(students.get(i).toString());
				filewriter.append("\n");
			}
			if(students.size()>0)
			   {  student.setSTUDENT_ID(students.get(students.size()-1).getSTUDENT_ID()+1);  }
			else
			   {  student.setSTUDENT_ID(1);  }
			students.add(student);
			filewriter.append(student.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return student;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<Student> students = FindAll();
		try 
		{
			filewriter = new FileWriter(Student.csvFile);
			
			for(int i=0;i<students.size();i++) 
			{
				students.remove(i);
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
    public static Student DelOne(int student_ID) 
    {
		FileWriter filewriter;
		List<Student> students = FindAll();
		Student student = StudentData.Search(student_ID);
		try 
		{
			filewriter = new FileWriter(Student.csvFile);
			for(int i=0;i<students.size();i++) 
			{
				if(students.get(i).getSTUDENT_ID()!=student_ID)
				{
					filewriter.append(students.get(i).toString());
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
		return student;
	}
}