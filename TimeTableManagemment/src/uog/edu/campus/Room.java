package uog.edu.campus;
public class Room 
{
    public static String csvFile="C:\\Users\\DeLL\\Desktop\\Excel\\Room.csv";
	private int ROOM_ID;
    private String ROOM_TYPE;
    private String BLOCK_NAME;
    private int ROOM_FLOOR;
    private int ROOM_CAPACITY;

	public int getROOM_ID() 
	  {   return ROOM_ID;    }
	public void setROOM_ID(int ROOM_id) 
	  {    ROOM_ID = ROOM_id;    }
	public String getROOM_TYPE() 
	  {    return ROOM_TYPE;   }
	public void setROOM_TYPE(String ROOM_type) 
	  {    ROOM_TYPE = ROOM_type;    }
	public String getBLOCK_NAME() 
	  {    return BLOCK_NAME;    }
	public void setBLOCK_NAME(String ROOM_name) 
	  {    BLOCK_NAME = ROOM_name;    }
	public int getROOM_FLOOR() 
	  {    return ROOM_FLOOR;    }
	public void setROOM_FLOOR(int ROOM_floor) 
	  {    ROOM_FLOOR = ROOM_floor;    }
	public int getROOM_CAPACITY() 
	  {    return ROOM_CAPACITY;    }
	public void setROOM_CAPACITY(int ROOM_capacity) 
	  {    ROOM_CAPACITY = ROOM_capacity;   }
	
	public String toString()
	{
		String str = null;
		       str = this.ROOM_ID
		     + "," + this.ROOM_TYPE
	         + "," + this.BLOCK_NAME
	         + "," + this.ROOM_FLOOR
	         + "," + this.ROOM_CAPACITY;
		return str;
	}
}