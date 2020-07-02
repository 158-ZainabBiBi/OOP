package uog.edu.timetable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class SemesterData 
{
	@SuppressWarnings("resource")
	public static List<Semester> FindAll()
	{
		List<Semester> semesters = new ArrayList<Semester>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Semester.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				Semester semester=new Semester();
				String[] semesterRow = line.split(",");
				semester.setSEMESTER_ID(Integer.parseInt(semesterRow[0]));
		    	semester.setSEMESTER_CODE(semesterRow[1]);
		    	semester.setSEMESTER_NAME(semesterRow[2]);
			    semester.setSEMESTER_STARTDATE(semesterRow[3]);
		    	semester.setSEMESTER_ENDDATE(semesterRow[4]);
				semesters.add(semester);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return semesters;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static Semester Search(int semester_id)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Semester.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Semester semester=new Semester();
				String[] semesterRow = line.split(",");
				if(Integer.parseInt(semesterRow[0])== semester_id)
				{
					semester.setSEMESTER_ID(Integer.parseInt(semesterRow[0]));
			    	semester.setSEMESTER_CODE(semesterRow[1]);
			    	semester.setSEMESTER_NAME(semesterRow[2]);
				    semester.setSEMESTER_STARTDATE(semesterRow[3]);
			    	semester.setSEMESTER_ENDDATE(semesterRow[4]);
				    return semester;
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
	public static List<Semester> Search1(String semester_code)
	{
		List<Semester> semesters = new ArrayList<Semester>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Semester.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Semester semester=new Semester();
				String[] semesterRow = line.split(",");
				if(semesterRow[1].contains(semester_code)== true)
				{
					semester.setSEMESTER_ID(Integer.parseInt(semesterRow[0]));
			    	semester.setSEMESTER_CODE(semesterRow[1]);
			    	semester.setSEMESTER_NAME(semesterRow[2]);
				    semester.setSEMESTER_STARTDATE(semesterRow[3]);
			    	semester.setSEMESTER_ENDDATE(semesterRow[4]);
			    	semesters.add(semester);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return semesters;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Semester> Search2(String semester_name)
	{
		List<Semester> semesters = new ArrayList<Semester>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Semester.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Semester semester=new Semester();
				String[] semesterRow = line.split(",");
				if(semesterRow[2].contains(semester_name)== true)
				{
					semester.setSEMESTER_ID(Integer.parseInt(semesterRow[0]));
			    	semester.setSEMESTER_CODE(semesterRow[1]);
			    	semester.setSEMESTER_NAME(semesterRow[2]);
				    semester.setSEMESTER_STARTDATE(semesterRow[3]);
			    	semester.setSEMESTER_ENDDATE(semesterRow[4]);
			    	semesters.add(semester);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return semesters;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "static-access" })
	public static  Semester Save(Semester semester)
	{
		FileWriter filewriter;
        List<Semester> semesters = FindAll();
		try 
		{
			filewriter = new FileWriter(Semester.csvFile);
			for(int i=0; i<semesters.size(); i++)
			{
				filewriter.append(semesters.get(i).toString());
				filewriter.append("\n");
			}
			if(semesters.size()>0)
			   {  semester.setSEMESTER_ID(semesters.get(semesters.size()-1).getSEMESTER_ID()+1);  }
			else
			   {  semester.setSEMESTER_ID(1);  }
			filewriter.append(semester.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return semester;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<Semester> semesters = FindAll();
		try 
		{
			filewriter = new FileWriter(Semester.csvFile);
			
			for(int i=0;i<semesters.size();i++) 
			{
				semesters.remove(i);
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
  public static Semester DelOne(int semester_id) 
  {
		FileWriter filewriter;
		List<Semester> semesters = FindAll();
		Semester semester = SemesterData.Search(semester_id);
		try 
		{
			filewriter = new FileWriter(Semester.csvFile);
			for(int i=0;i<semesters.size();i++) 
			{
				if(semesters.get(i).getSEMESTER_ID()!=semester_id)
				{
					filewriter.append(semesters.get(i).toString());
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
		return semester;
	}
}