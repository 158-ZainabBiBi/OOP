package uog.edu.course;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class CourseData 
{
	@SuppressWarnings("resource")
	public static List<Course> FindAll()
	{
		List<Course> courses = new ArrayList<Course>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Course.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				Course course=new Course();
				String[] courseRow = line.split(",");
				course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
				course.setCOURSE_CODE(courseRow[1]);
				course.setCOURSE_TITLE(courseRow[2]);
			    course.setCOURSE_DESC(courseRow[3]);
				course.setCOURSE_CREDITHOUR(Integer.parseInt(courseRow[4]));
				if (courseRow.length>5) 
				{    course.setCOURSEPREREQUIST_ID(CourseData.Search(Integer.parseInt(courseRow[5])));    }
				courses.add(course);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return courses;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static Course Search(int course_id)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Course.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Course course=new Course();
				String[] courseRow = line.split(",");
				if(Integer.parseInt(courseRow[0])== course_id)
				{
					course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
					course.setCOURSE_CODE(courseRow[1]);
					course.setCOURSE_TITLE(courseRow[2]);
				    course.setCOURSE_DESC(courseRow[3]);
					course.setCOURSE_CREDITHOUR(Integer.parseInt(courseRow[4]));
					if (courseRow.length>5) 
					{    course.setCOURSEPREREQUIST_ID(CourseData.Search(Integer.parseInt(courseRow[5])));    }
				    return course;
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return null;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Course> Search1(String course_code)
	{
		List<Course> courses = new ArrayList<Course>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Course.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Course course=new Course();
				String[] courseRow = line.split(",");
				if(courseRow[1].contains(course_code)== true)
				{
					course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
					course.setCOURSE_CODE(courseRow[1]);
					course.setCOURSE_TITLE(courseRow[2]);
				    course.setCOURSE_DESC(courseRow[3]);
					course.setCOURSE_CREDITHOUR(Integer.parseInt(courseRow[4]));
					if (courseRow.length>5) 
					{    course.setCOURSEPREREQUIST_ID(CourseData.Search(Integer.parseInt(courseRow[5])));    }
			    	courses.add(course);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return courses;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Course> Search2(String course_desc)
	{
		List<Course> courses = new ArrayList<Course>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Course.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Course course=new Course();
				String[] courseRow = line.split(",");
				if(courseRow[3].contains(course_desc)== true)
				{
					course.setCOURSE_ID(Integer.parseInt(courseRow[0]));
					course.setCOURSE_CODE(courseRow[1]);
					course.setCOURSE_TITLE(courseRow[2]);
				    course.setCOURSE_DESC(courseRow[3]);
					course.setCOURSE_CREDITHOUR(Integer.parseInt(courseRow[4]));
					if (courseRow.length>5) 
					{    course.setCOURSEPREREQUIST_ID(CourseData.Search(Integer.parseInt(courseRow[5])));    }
			    	courses.add(course);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return courses;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "static-access" })
	public static  Course Save(Course course)
	{
		FileWriter filewriter;
        List<Course> courses = FindAll();
		try 
		{
			filewriter = new FileWriter(Course.csvFile);
			for(int i=0; i<courses.size(); i++)
			{
				filewriter.append(courses.get(i).toString());
				filewriter.append("\n");
			}
			if(courses.size()>0)
			   {  course.setCOURSE_ID(courses.get(courses.size()-1).getCOURSE_ID()+1);  }
			else
			   {  course.setCOURSE_ID(1);  }
			filewriter.append(course.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return course;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<Course> courses = FindAll();
		try 
		{
			filewriter = new FileWriter(Course.csvFile);
			
			for(int i=0;i<courses.size();i++) 
			{
				courses.remove(i);
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
//////////////////////////////////////////////////////////////////////////////////////////////////
  public static Course DelOne(int course_id) 
  {
		FileWriter filewriter;
		List<Course> courses = FindAll();
		Course course = CourseData.Search(course_id);
		try 
		{
			filewriter = new FileWriter(Course.csvFile);
			for(int i=0;i<courses.size();i++) 
			{
				if(courses.get(i).getCOURSE_ID()!=course_id)
				{
					filewriter.append(courses.get(i).toString());
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
		return course;
	}
}