package uog.edu.teacher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import uog.edu.course.Course;
import uog.edu.course.CourseData;
import uog.edu.teacher.Teacher;
import uog.edu.teacher.TeacherData;
import uog.edu.timetable.SemesterData;
@SuppressWarnings("unused")
public class TeacherCourseData 
{
	@SuppressWarnings("resource")
	public static List<TeacherCourse> FindAll()
	{
		List<TeacherCourse> teachercourses = new ArrayList<TeacherCourse>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				TeacherCourse teachercourse=new TeacherCourse();
				String[] teachercourserow = line.split(",");
				teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourserow[0]));
				teachercourse.setTEACHER_ID(TeacherData.Search(Integer.parseInt(teachercourserow[1])));
				teachercourse.setSECTION(teachercourserow[2]);
			    teachercourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(teachercourserow[3])));
			    teachercourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(teachercourserow[4])));
				teachercourses.add(teachercourse);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return teachercourses;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static TeacherCourse Search(int teachercourse_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TeacherCourseData teachercourses = new TeacherCourseData();
				String[] teachercourserow = line.split(",");		
				if (Integer.parseInt(teachercourserow[0]) == teachercourse_id) 
				{
					TeacherCourse teachercourse=new TeacherCourse();
					teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourserow[0]));
					teachercourse.setTEACHER_ID(TeacherData.Search(Integer.parseInt(teachercourserow[1])));
					teachercourse.setSECTION(teachercourserow[2]);
				    teachercourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(teachercourserow[3])));
				    teachercourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(teachercourserow[4])));
					return teachercourse;
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
	@SuppressWarnings("resource")
	public static TeacherCourse Search1(int teacher_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TeacherCourseData teachercourses = new TeacherCourseData();
				String[] teachercourserow = line.split(",");		
				if (Integer.parseInt(teachercourserow[1]) == teacher_id) 
				{
					TeacherCourse teachercourse=new TeacherCourse();
					teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourserow[0]));
					teachercourse.setTEACHER_ID(TeacherData.Search(Integer.parseInt(teachercourserow[1])));
					teachercourse.setSECTION(teachercourserow[2]);
				    teachercourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(teachercourserow[3])));
				    teachercourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(teachercourserow[4])));
					return teachercourse;
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
	public static List<TeacherCourse> Search2(String section)
	{
		List<TeacherCourse> teachercourses = new ArrayList<TeacherCourse>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				TeacherCourse teachercourse=new TeacherCourse();
				String[] teachercourserow = line.split(",");
				if(teachercourserow[2].contains(section)== true)
				{
					teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourserow[0]));
					teachercourse.setTEACHER_ID(TeacherData.Search(Integer.parseInt(teachercourserow[1])));
					teachercourse.setSECTION(teachercourserow[2]);
				    teachercourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(teachercourserow[3])));
				    teachercourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(teachercourserow[4])));
			    	teachercourses.add(teachercourse);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return teachercourses;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static TeacherCourse Search3(int course_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TeacherCourseData teachercourses = new TeacherCourseData();
				String[] teachercourserow = line.split(",");		
				if (Integer.parseInt(teachercourserow[3]) == course_id) 
				{
					TeacherCourse teachercourse=new TeacherCourse();
					teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourserow[0]));
					teachercourse.setTEACHER_ID(TeacherData.Search(Integer.parseInt(teachercourserow[1])));
					teachercourse.setSECTION(teachercourserow[2]);
				    teachercourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(teachercourserow[3])));
				    teachercourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(teachercourserow[4])));
					return teachercourse;
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
	public static TeacherCourse Search4(int semester_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TeacherCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TeacherCourseData teachercourses = new TeacherCourseData();
				String[] teachercourserow = line.split(",");		
				if (Integer.parseInt(teachercourserow[4]) == semester_id) 
				{
					TeacherCourse teachercourse=new TeacherCourse();
					teachercourse.setTEACHERCOURSE_ID(Integer.parseInt(teachercourserow[0]));
					teachercourse.setTEACHER_ID(TeacherData.Search(Integer.parseInt(teachercourserow[1])));
					teachercourse.setSECTION(teachercourserow[2]);
				    teachercourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(teachercourserow[3])));
				    teachercourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(teachercourserow[4])));
					return teachercourse;
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
	@SuppressWarnings({ "resource", "static-access" })
	public static  TeacherCourse Save(TeacherCourse teachercourse)
	{
		FileWriter filewriter;
        List<TeacherCourse> teachercourses = FindAll();
		try 
		{
			filewriter = new FileWriter(TeacherCourse.csvFile);
			for(int i=0; i<teachercourses.size(); i++)
			{
				filewriter.append(teachercourses.get(i).toString());
				filewriter.append("\n");
			}
			if(teachercourses.size()>0)
			   {  teachercourse.setTEACHERCOURSE_ID(teachercourses.get(teachercourses.size()-1).getTEACHERCOURSE_ID()+1);  }
			else
			   {  teachercourse.setTEACHERCOURSE_ID(1);  }
			teachercourses.add(teachercourse);
			filewriter.append(teachercourse.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return teachercourse;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<TeacherCourse> teachercourses = FindAll();
		try 
		{
			filewriter = new FileWriter(TeacherCourse.csvFile);
			
			for(int i=0;i<teachercourses.size();i++) 
			{
				teachercourses.remove(i);
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
    public static TeacherCourse DelOne(int teachercourse_ID) 
    {
		FileWriter filewriter;
		List<TeacherCourse> teachercourses = FindAll();
		TeacherCourse teachercourse = TeacherCourseData.Search(teachercourse_ID);
		try 
		{
			filewriter = new FileWriter(TeacherCourse.csvFile);
			for(int i=0;i<teachercourses.size();i++) 
			{
				if(teachercourses.get(i).getTEACHERCOURSE_ID()!=teachercourse_ID)
				{
					filewriter.append(teachercourses.get(i).toString());
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
		return teachercourse;
	}
}