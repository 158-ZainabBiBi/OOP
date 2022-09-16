package uog.edu.timetable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import uog.edu.campus.RoomData;
import uog.edu.course.Course;
import uog.edu.course.CourseData;
import uog.edu.student.Student;
import uog.edu.student.StudentData;
import uog.edu.teacher.TeacherCourseData;
@SuppressWarnings("unused")
public class TimeTableData 
{
	@SuppressWarnings("resource")
	public static List<TimeTable> FindAll()
	{
		List<TimeTable> timetables = new ArrayList<TimeTable>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(TimeTable.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				TimeTable timetable=new TimeTable();
				String[] timetablerow = line.split(",");
				timetable.setTIMETABLE_ID(Integer.parseInt(timetablerow[0]));
				timetable.setTEACHERCOURSE_ID(TeacherCourseData.Search(Integer.parseInt(timetablerow[1])));
				timetable.setTIMESLOT_ID(TimeSlotData.Search(Integer.parseInt(timetablerow[2])));
			    timetable.setROOM_ID(RoomData.Search(Integer.parseInt(timetablerow[3])));
			    timetable.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(timetablerow[4])));
				timetables.add(timetable);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return timetables;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("resource")
	public static TimeTable Search(int timetable_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TimeTable.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TimeTableData timetables = new TimeTableData();
				String[] timetablerow = line.split(",");		
				if (Integer.parseInt(timetablerow[0]) == timetable_id) 
				{
					TimeTable timetable=new TimeTable();
					timetable.setTIMETABLE_ID(Integer.parseInt(timetablerow[0]));
					timetable.setTEACHERCOURSE_ID(TeacherCourseData.Search(Integer.parseInt(timetablerow[1])));
					timetable.setTIMESLOT_ID(TimeSlotData.Search(Integer.parseInt(timetablerow[2])));
				    timetable.setROOM_ID(RoomData.Search(Integer.parseInt(timetablerow[3])));
				    timetable.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(timetablerow[4])));
					return timetable;
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
	public static TimeTable Search1(int teachercourse_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TimeTable.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TimeTableData timetables = new TimeTableData();
				String[] timetablerow = line.split(",");		
				if (Integer.parseInt(timetablerow[0]) == teachercourse_id) 
				{
					TimeTable timetable=new TimeTable();
					timetable.setTIMETABLE_ID(Integer.parseInt(timetablerow[0]));
					timetable.setTEACHERCOURSE_ID(TeacherCourseData.Search(Integer.parseInt(timetablerow[1])));
					timetable.setTIMESLOT_ID(TimeSlotData.Search(Integer.parseInt(timetablerow[2])));
				    timetable.setROOM_ID(RoomData.Search(Integer.parseInt(timetablerow[3])));
				    timetable.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(timetablerow[4])));
					return timetable;
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
	public static TimeTable Search2(int timeslot_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TimeTable.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TimeTableData timetables = new TimeTableData();
				String[] timetablerow = line.split(",");		
				if (Integer.parseInt(timetablerow[0]) == timeslot_id) 
				{
					TimeTable timetable=new TimeTable();
					timetable.setTIMETABLE_ID(Integer.parseInt(timetablerow[0]));
					timetable.setTEACHERCOURSE_ID(TeacherCourseData.Search(Integer.parseInt(timetablerow[1])));
					timetable.setTIMESLOT_ID(TimeSlotData.Search(Integer.parseInt(timetablerow[2])));
				    timetable.setROOM_ID(RoomData.Search(Integer.parseInt(timetablerow[3])));
				    timetable.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(timetablerow[4])));
					return timetable;
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
	public static TimeTable Search3(int room_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TimeTable.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TimeTableData timetables = new TimeTableData();
				String[] timetablerow = line.split(",");		
				if (Integer.parseInt(timetablerow[4]) == room_id) 
				{
					TimeTable timetable=new TimeTable();
					timetable.setTIMETABLE_ID(Integer.parseInt(timetablerow[0]));
					timetable.setTEACHERCOURSE_ID(TeacherCourseData.Search(Integer.parseInt(timetablerow[1])));
					timetable.setTIMESLOT_ID(TimeSlotData.Search(Integer.parseInt(timetablerow[2])));
				    timetable.setROOM_ID(RoomData.Search(Integer.parseInt(timetablerow[3])));
				    timetable.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(timetablerow[4])));
					return timetable;
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
	public static TimeTable Search4(int semester_id)  
	{
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(TimeTable.csvFile));
			
			while ((line = bufferreader.readLine()) != null) 
			{
				TimeTableData timetables = new TimeTableData();
				String[] timetablerow = line.split(",");		
				if (Integer.parseInt(timetablerow[4]) == semester_id) 
				{
					TimeTable timetable=new TimeTable();
					timetable.setTIMETABLE_ID(Integer.parseInt(timetablerow[0]));
					timetable.setTEACHERCOURSE_ID(TeacherCourseData.Search(Integer.parseInt(timetablerow[1])));
					timetable.setTIMESLOT_ID(TimeSlotData.Search(Integer.parseInt(timetablerow[2])));
				    timetable.setROOM_ID(RoomData.Search(Integer.parseInt(timetablerow[3])));
				    timetable.setSEMESTER_ID(SemesterData.Search(Integer.parseInt(timetablerow[4])));
					return timetable;
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
	public static  TimeTable Save(TimeTable timetable)
	{
		FileWriter filewriter;
        List<TimeTable> timetables = FindAll();
		try 
		{
			filewriter = new FileWriter(TimeTable.csvFile);
			for(int i=0; i<timetables.size(); i++)
			{
				filewriter.append(timetables.get(i).toString());
				filewriter.append("\n");
			}
			if(timetables.size()>0)
			   {  timetable.setTIMETABLE_ID(timetables.get(timetables.size()-1).getTIMETABLE_ID()+1);  }
			else
			   {  timetable.setTIMETABLE_ID(1);  }
			timetables.add(timetable);
			filewriter.append(timetable.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return timetable;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<TimeTable> timetables = FindAll();
		try 
		{
			filewriter = new FileWriter(TimeTable.csvFile);
			
			for(int i=0;i<timetables.size();i++) 
			{
				timetables.remove(i);
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
    public static TimeTable DelOne(int timetable_ID) 
    {
		FileWriter filewriter;
		List<TimeTable> timetables = FindAll();
		TimeTable timetable = TimeTableData.Search(timetable_ID);
		try 
		{
			filewriter = new FileWriter(TimeTable.csvFile);
			for(int i=0;i<timetables.size();i++) 
			{
				if(timetables.get(i).getTIMETABLE_ID()!=timetable_ID)
				{
					filewriter.append(timetables.get(i).toString());
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
		return timetable;
	}
}