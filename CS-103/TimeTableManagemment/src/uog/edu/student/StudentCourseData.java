package uog.edu.student;
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
import uog.edu.timetable.SemesterData;
@SuppressWarnings("unused")
public class StudentCourseData 
{
	@SuppressWarnings("resource")
	public static List<StudentCourse> FindAll()
	{
		List<StudentCourse> studentcourses = new ArrayList<StudentCourse>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				StudentCourse studentcourse=new StudentCourse();
				String[] studentcourserow = line.split(",");
				studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentcourserow[0]));
				studentcourse.setSTUDENT_ID(StudentData.Search(Integer.parseInt(studentcourserow[1])));
				studentcourse.setSECTION(studentcourserow[2]);
			    studentcourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(studentcourserow[3])));
			    studentcourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(studentcourserow[4])));
				studentcourses.add(studentcourse);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return studentcourses;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static StudentCourse Search(int studentcourse_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				StudentCourseData studentcourses = new StudentCourseData();
				String[] studentcourserow = line.split(",");		
				if (Integer.parseInt(studentcourserow[0]) == studentcourse_id) 
				{
					StudentCourse studentcourse=new StudentCourse();
					studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentcourserow[0]));
					studentcourse.setSTUDENT_ID(StudentData.Search(Integer.parseInt(studentcourserow[1])));
					studentcourse.setSECTION(studentcourserow[2]);
				    studentcourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(studentcourserow[3])));
				    studentcourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(studentcourserow[4])));
					return studentcourse;
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
	public static StudentCourse Search1(int student_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				StudentCourseData studentcourses = new StudentCourseData();
				String[] studentcourserow = line.split(",");		
				if (Integer.parseInt(studentcourserow[1]) == student_id) 
				{
					StudentCourse studentcourse=new StudentCourse();
					studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentcourserow[0]));
					studentcourse.setSTUDENT_ID(StudentData.Search(Integer.parseInt(studentcourserow[1])));
					studentcourse.setSECTION(studentcourserow[2]);
				    studentcourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(studentcourserow[3])));
				    studentcourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(studentcourserow[4])));
					return studentcourse;
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
	public static List<StudentCourse> Search2(String section)
	{
		List<StudentCourse> studentcourses = new ArrayList<StudentCourse>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				StudentCourse studentcourse=new StudentCourse();
				String[] studentcourserow = line.split(",");
				if(studentcourserow[2].contains(section)== true)
				{
					studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentcourserow[0]));
					studentcourse.setSTUDENT_ID(StudentData.Search(Integer.parseInt(studentcourserow[1])));
					studentcourse.setSECTION(studentcourserow[2]);
				    studentcourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(studentcourserow[3])));
				    studentcourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(studentcourserow[4])));
			    	studentcourses.add(studentcourse);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return studentcourses;
		}
////////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static StudentCourse Search3(int course_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				StudentCourseData studentcourses = new StudentCourseData();
				String[] studentcourserow = line.split(",");		
				if (Integer.parseInt(studentcourserow[3]) == course_id) 
				{
					StudentCourse studentcourse=new StudentCourse();
					studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentcourserow[0]));
					studentcourse.setSTUDENT_ID(StudentData.Search(Integer.parseInt(studentcourserow[1])));
					studentcourse.setSECTION(studentcourserow[2]);
				    studentcourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(studentcourserow[3])));
				    studentcourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(studentcourserow[4])));
					return studentcourse;
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
	public static StudentCourse Search4(int semester_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				StudentCourseData studentcourses = new StudentCourseData();
				String[] studentcourserow = line.split(",");		
				if (Integer.parseInt(studentcourserow[4]) == semester_id) 
				{
					StudentCourse studentcourse=new StudentCourse();
					studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentcourserow[0]));
					studentcourse.setSTUDENT_ID(StudentData.Search(Integer.parseInt(studentcourserow[1])));
					studentcourse.setSECTION(studentcourserow[2]);
				    studentcourse.setCOURSE_ID(CourseData.Search(Integer.parseInt(studentcourserow[3])));
				    studentcourse.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(studentcourserow[4])));
					return studentcourse;
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
	public static  StudentCourse Save(StudentCourse studentcourse)
	{
		FileWriter filewriter;
        List<StudentCourse> studentcourses = FindAll();
		try 
		{
			filewriter = new FileWriter(StudentCourse.csvFile);
			for(int i=0; i<studentcourses.size(); i++)
			{
				filewriter.append(studentcourses.get(i).toString());
				filewriter.append("\n");
			}
			if(studentcourses.size()>0)
			   {  studentcourse.setSTUDENTCOURSE_ID(studentcourses.get(studentcourses.size()-1).getSTUDENTCOURSE_ID()+1);  }
			else
			   {  studentcourse.setSTUDENTCOURSE_ID(1);  }
			studentcourses.add(studentcourse);
			filewriter.append(studentcourse.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return studentcourse;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<StudentCourse> studentcourses = FindAll();
		try 
		{
			filewriter = new FileWriter(StudentCourse.csvFile);
			
			for(int i=0;i<studentcourses.size();i++) 
			{
				studentcourses.remove(i);
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
    public static StudentCourse DelOne(int studentcourse_ID) 
    {
		FileWriter filewriter;
		List<StudentCourse> studentcourses = FindAll();
		StudentCourse studentcourse = StudentCourseData.Search(studentcourse_ID);
		try 
		{
			filewriter = new FileWriter(StudentCourse.csvFile);
			for(int i=0;i<studentcourses.size();i++) 
			{
				if(studentcourses.get(i).getSTUDENTCOURSE_ID()!=studentcourse_ID)
				{
					filewriter.append(studentcourses.get(i).toString());
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
		return studentcourse;
	}
}