package uog.edu.timetable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class TimeSlotData 
{
	@SuppressWarnings("resource")
	public static List<TimeSlot> FindAll()
	{
		List<TimeSlot> timeslots = new ArrayList<TimeSlot>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(TimeSlot.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				TimeSlot timeslot=new TimeSlot();
				String[] timeslotrow = line.split(",");
				timeslot.setTIMESLOT_ID(Integer.parseInt(timeslotrow[0]));
			    timeslot.setWEEKDAY_ID(WeekDayData.Search(Integer.parseInt(timeslotrow[1])));
		    	timeslot.setTIMESLOT_START(timeslotrow[2]);
		    	timeslot.setTIMESLOT_END(timeslotrow[3]);

				timeslots.add(timeslot);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return timeslots;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static TimeSlot Search(int timeslot_ID)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(TimeSlot.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				TimeSlot timeslot=new TimeSlot();
				String[] timeslotrow = line.split(",");
				if(Integer.parseInt(timeslotrow[0])== timeslot_ID)
				{
					timeslot.setTIMESLOT_ID(Integer.parseInt(timeslotrow[0]));
				    timeslot.setWEEKDAY_ID(WeekDayData.Search(Integer.parseInt(timeslotrow[1])));
			    	timeslot.setTIMESLOT_START(timeslotrow[2]);
			    	timeslot.setTIMESLOT_END(timeslotrow[3]);
				    return timeslot;
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
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static TimeSlot Search1(int weekday_id)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(TimeSlot.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				TimeSlot timeslot=new TimeSlot();
				String[] timeslotrow = line.split(",");
				if(Integer.parseInt(timeslotrow[1])== weekday_id)
				{
					timeslot.setTIMESLOT_ID(Integer.parseInt(timeslotrow[0]));
				    timeslot.setWEEKDAY_ID(WeekDayData.Search(Integer.parseInt(timeslotrow[1])));
			    	timeslot.setTIMESLOT_START(timeslotrow[2]);
			    	timeslot.setTIMESLOT_END(timeslotrow[3]);
				    return timeslot;
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
	public static  TimeSlot Save(TimeSlot timeslot)
	{
		FileWriter filewriter;
        List<TimeSlot> timeslots = FindAll();
		try 
		{
			filewriter = new FileWriter(TimeSlot.csvFile);
			for(int i=0; i<timeslots.size(); i++)
			{
				filewriter.append(timeslots.get(i).toString());
				filewriter.append("\n");
			}
			if(timeslots.size()>0)
			   {  timeslot.setTIMESLOT_ID(timeslots.get(timeslots.size()-1).getTIMESLOT_ID()+1);  }
			else
			   {  timeslot.setTIMESLOT_ID(1);  }
			filewriter.append(timeslot.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return timeslot;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<TimeSlot> timeslots = FindAll();
		try 
		{
			filewriter = new FileWriter(TimeSlot.csvFile);
			
			for(int i=0;i<timeslots.size();i++) 
			{
				timeslots.remove(i);
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
  public static TimeSlot DelOne(int timeslot_ID) 
  {
		FileWriter filewriter;
		List<TimeSlot> timeslots = FindAll();
		TimeSlot timeslot = TimeSlotData.Search(timeslot_ID);
		try 
		{
			filewriter = new FileWriter(TimeSlot.csvFile);
			for(int i=0;i<timeslots.size();i++) 
			{
				if(timeslots.get(i).getTIMESLOT_ID()!=timeslot_ID)
				{
					filewriter.append(timeslots.get(i).toString());
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
		return timeslot;
	}
}