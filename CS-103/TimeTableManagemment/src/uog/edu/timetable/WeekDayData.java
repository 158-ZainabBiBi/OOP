package uog.edu.timetable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class WeekDayData 
{
	@SuppressWarnings("resource")
	public static List<WeekDay> FindAll()
	{
		List<WeekDay> weekdays = new ArrayList<WeekDay>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(WeekDay.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				WeekDay weekday=new WeekDay();
				String[] weekdayRow = line.split(",");
				weekday.setWEEKDAY_ID(Integer.parseInt(weekdayRow[0]));
		    	weekday.setWEEKDAY_NAME(weekdayRow[1]);
				weekdays.add(weekday);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println(e); 
			e.printStackTrace();    
		}
		return weekdays;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static WeekDay Search(int weekday_ID)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(WeekDay.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				WeekDay weekday=new WeekDay();
				String[] weekdayRow = line.split(",");
				if(Integer.parseInt(weekdayRow[0])== weekday_ID)
				{
					weekday.setWEEKDAY_ID(Integer.parseInt(weekdayRow[0]));
			    	weekday.setWEEKDAY_NAME(weekdayRow[1]);
				    return weekday;
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
	@SuppressWarnings({ "resource" })
	public static List<WeekDay> Search1(String weekday_name)
	{
		List<WeekDay> weekdays = new ArrayList<WeekDay>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(WeekDay.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				WeekDay weekday=new WeekDay();
				String[] weekdayRow = line.split(",");
				if(weekdayRow[1].contains(weekday_name)== true)
				{
					weekday.setWEEKDAY_ID(Integer.parseInt(weekdayRow[0]));
			    	weekday.setWEEKDAY_NAME(weekdayRow[1]);
			    	weekdays.add(weekday);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return weekdays;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "static-access" })
	public static  WeekDay Save(WeekDay weekday)
	{
		FileWriter filewriter;
        List<WeekDay> weekdays = FindAll();
		try 
		{
			filewriter = new FileWriter(WeekDay.csvFile);
			for(int i=0; i<weekdays.size(); i++)
			{
				filewriter.append(weekdays.get(i).toString());
				filewriter.append("\n");
			}
			if(weekdays.size()>0)
			   {  weekday.setWEEKDAY_ID(weekdays.get(weekdays.size()-1).getWEEKDAY_ID()+1);  }
			else
			   {  weekday.setWEEKDAY_ID(1);  }
			filewriter.append(weekday.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return weekday;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<WeekDay> weekdays = FindAll();
		try 
		{
			filewriter = new FileWriter(WeekDay.csvFile);
			
			for(int i=0;i<weekdays.size();i++) 
			{
				weekdays.remove(i);
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
  public static WeekDay DelOne(int weekday_ID) 
  {
		FileWriter filewriter;
		List<WeekDay> weekdays = FindAll();
		WeekDay weekday = WeekDayData.Search(weekday_ID);
		try 
		{
			filewriter = new FileWriter(WeekDay.csvFile);
			for(int i=0;i<weekdays.size();i++) 
			{
				if(weekdays.get(i).getWEEKDAY_ID()!=weekday_ID)
				{
					filewriter.append(weekdays.get(i).toString());
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
		return weekday;
	}
}