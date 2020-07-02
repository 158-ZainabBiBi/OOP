package uog.edu.teacher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import uog.edu.course.Course;
import uog.edu.course.CourseData;
import uog.edu.person.PersonData;
import uog.edu.teacher.Teacher;
import uog.edu.teacher.TeacherData;
@SuppressWarnings("unused")
public class TeacherData 
{
	@SuppressWarnings("resource")
	public static List<Teacher> FindAll()
	{
		List<Teacher> teachers = new ArrayList<Teacher>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Teacher.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				Teacher teacher=new Teacher();
				String[] teacherrow = line.split(",");
				teacher.setTEACHER_ID(Integer.parseInt(teacherrow[0]));
				teacher.setPERSON_ID(PersonData.Search(Integer.parseInt(teacherrow[1])));
				teacher.setTEACHER_GRADE(teacherrow[2]);
				teachers.add(teacher);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return teachers;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static Teacher Search(int teacher_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Teacher.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TeacherData teachers = new TeacherData();
				String[] teacherrow = line.split(",");		
				if (Integer.parseInt(teacherrow[0]) == teacher_id) 
				{
					Teacher teacher=new Teacher();
					teacher.setTEACHER_ID(Integer.parseInt(teacherrow[0]));
					teacher.setPERSON_ID(PersonData.Search(Integer.parseInt(teacherrow[1])));
					teacher.setTEACHER_GRADE(teacherrow[2]);
					return teacher;
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
	public static List<Teacher> Search1(String grade)
	{
		List<Teacher> teachers = new ArrayList<Teacher>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Teacher.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Teacher teacher=new Teacher();
				String[] teacherrow = line.split(",");
				if(teacherrow[2].contains(grade)== true)
				{
					teacher.setTEACHER_ID(Integer.parseInt(teacherrow[0]));
					teacher.setPERSON_ID(PersonData.Search(Integer.parseInt(teacherrow[1])));
					teacher.setTEACHER_GRADE(teacherrow[2]);
			    	teachers.add(teacher);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return teachers;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "static-access" })
	public static  Teacher Save(Teacher teacher)
	{
		FileWriter filewriter;
        List<Teacher> teachers = FindAll();
		try 
		{
			filewriter = new FileWriter(Teacher.csvFile);
			for(int i=0; i<teachers.size(); i++)
			{
				filewriter.append(teachers.get(i).toString());
				filewriter.append("\n");
			}
			if(teachers.size()>0)
			   {  teacher.setTEACHER_ID(teachers.get(teachers.size()-1).getTEACHER_ID()+1);  }
			else
			   {  teacher.setTEACHER_ID(1);  }
			teachers.add(teacher);
			filewriter.append(teacher.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return teacher;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<Teacher> teachers = FindAll();
		try 
		{
			filewriter = new FileWriter(Teacher.csvFile);
			
			for(int i=0;i<teachers.size();i++) 
			{
				teachers.remove(i);
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
    public static Teacher DelOne(int teacher_ID) 
    {
		FileWriter filewriter;
		List<Teacher> teachers = FindAll();
		Teacher teacher = TeacherData.Search(teacher_ID);
		try 
		{
			filewriter = new FileWriter(Teacher.csvFile);
			for(int i=0;i<teachers.size();i++) 
			{
				if(teachers.get(i).getTEACHER_ID()!=teacher_ID)
				{
					filewriter.append(teachers.get(i).toString());
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
		return teacher;
	}
}