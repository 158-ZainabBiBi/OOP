package uog.edu.campus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class RoomData 
{
	@SuppressWarnings("resource")
	public static List<Room> FindAll()
	{
		List<Room> rooms = new ArrayList<Room>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Room.csvFile));
			while ((line = buffereader.readLine()) != null)
			{	
				Room room=new Room();
				String[] roomRow = line.split(",");
				room.setROOM_ID(Integer.parseInt(roomRow[0]));
				room.setROOM_TYPE(roomRow[1]);
				room.setBLOCK_NAME(roomRow[2]);
				room.setROOM_FLOOR(Integer.parseInt(roomRow[3]));
				room.setROOM_CAPACITY(Integer.parseInt(roomRow[4]));
				rooms.add(room);
			}
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return rooms;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static Room Search(int room_id)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Room.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Room room=new Room();
				String[] roomRow = line.split(",");
				if(Integer.parseInt(roomRow[0])== room_id)
				{
					room.setROOM_ID(Integer.parseInt(roomRow[0]));
					room.setROOM_TYPE(roomRow[1]);
					room.setBLOCK_NAME(roomRow[2]);
					room.setROOM_FLOOR(Integer.parseInt(roomRow[3]));
					room.setROOM_CAPACITY(Integer.parseInt(roomRow[4]));
				    return room;
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
	public static List<Room> Search1(String room_type)
	{
		List<Room> rooms = new ArrayList<Room>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Room.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Room room=new Room();
				String[] roomRow = line.split(",");
				if(roomRow[1].contains(room_type)== true)
				{
					room.setROOM_ID(Integer.parseInt(roomRow[0]));
					room.setROOM_TYPE(roomRow[1]);
					room.setBLOCK_NAME(roomRow[2]);
					room.setROOM_FLOOR(Integer.parseInt(roomRow[3]));
					room.setROOM_CAPACITY(Integer.parseInt(roomRow[4]));
			    	rooms.add(room);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return rooms;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource" })
	public static List<Room> Search2(String block_name)
	{
		List<Room> rooms = new ArrayList<Room>();
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Room.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Room room=new Room();
				String[] roomRow = line.split(",");
				if(roomRow[2].contains(block_name)== true)
				{
					room.setROOM_ID(Integer.parseInt(roomRow[0]));
					room.setROOM_TYPE(roomRow[1]);
					room.setBLOCK_NAME(roomRow[2]);
					room.setROOM_FLOOR(Integer.parseInt(roomRow[3]));
					room.setROOM_CAPACITY(Integer.parseInt(roomRow[4]));
			    	rooms.add(room);
				}
			}
		}
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e);  
			e.printStackTrace();    
		}
		return rooms;
		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings({ "resource", "unused" })
	public static Room Search3(int room_floor)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Room.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Room room=new Room();
				String[] roomRow = line.split(",");
				if(Integer.parseInt(roomRow[3])== room_floor)
				{
					room.setROOM_ID(Integer.parseInt(roomRow[0]));
					room.setROOM_TYPE(roomRow[1]);
					room.setBLOCK_NAME(roomRow[2]);
					room.setROOM_FLOOR(Integer.parseInt(roomRow[3]));
					room.setROOM_CAPACITY(Integer.parseInt(roomRow[4]));
				    return room;
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
	@SuppressWarnings({ "resource", "unused" })
	public static Room Search4(int room_id)
	{
		String line;
		try 
		{
			BufferedReader buffereader = new BufferedReader(new FileReader(Room.csvFile));
			while ((line = buffereader.readLine()) !=null)
			{	
				Room room=new Room();
				String[] roomRow = line.split(",");
				if(Integer.parseInt(roomRow[4])== room_id)
				{
					room.setROOM_ID(Integer.parseInt(roomRow[0]));
					room.setROOM_TYPE(roomRow[1]);
					room.setBLOCK_NAME(roomRow[2]);
					room.setROOM_FLOOR(Integer.parseInt(roomRow[3]));
					room.setROOM_CAPACITY(Integer.parseInt(roomRow[4]));
				    return room;
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
	@SuppressWarnings({ "resource", "static-access" })
	public static  Room Save(Room room)
	{
		FileWriter filewriter;
        List<Room> rooms = FindAll();
		try 
		{
			filewriter = new FileWriter(Room.csvFile);
			for(int i=0; i<rooms.size(); i++)
			{
				filewriter.append(rooms.get(i).toString());
				filewriter.append("\n");
			}
			if(rooms.size()>0)
			   {  room.setROOM_ID(rooms.get(rooms.size()-1).getROOM_ID()+1);  }
			else
			   {  room.setROOM_ID(1);  }
			filewriter.append(room.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} 
		catch (IOException e) 
		{   
			System.out.println("CSV File cannot be Read!" +e); 
			e.printStackTrace();    
		}
		return room;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
    public static String DelAll() 
    {
		FileWriter filewriter;
		List<Room> rooms = FindAll();
		try 
		{
			filewriter = new FileWriter(Room.csvFile);
			
			for(int i=0;i<rooms.size();i++) 
			{
				rooms.remove(i);
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
  public static Room DelOne(int room_id) 
  {
		FileWriter filewriter;
		List<Room> rooms = FindAll();
		Room room = RoomData.Search(room_id);
		try 
		{
			filewriter = new FileWriter(Room.csvFile);
			for(int i=0;i<rooms.size();i++) 
			{
				if(rooms.get(i).getROOM_ID()!=room_id)
				{
					filewriter.append(rooms.get(i).toString());
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
		return room;
	}
}