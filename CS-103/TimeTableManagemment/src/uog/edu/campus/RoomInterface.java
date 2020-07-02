package uog.edu.campus;
import java.util.List;
import java.util.Scanner;
public class RoomInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void RoomMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  Rooms Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All Rooms Data");
			System.out.println("2.  Search Room By Room-ID");
			System.out.println("3.  Search Room By Room-Type");
			System.out.println("4.  Search Room By Block-Name");
			System.out.println("5.  Delete Room By Room-ID");
			System.out.println("6.  Delete All Rooms Data");
			System.out.println("7.  Insert Room Row");
			System.out.println("8.  Quit Room");
			System.out.print("Enter Your Choice [1-8]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			 case 1:
				    System.out.println("---------------------------------");
					System.out.println("       Show All Rooms Data       ");
					System.out.println("---------------------------------");
					List<Room> room2 = RoomData.FindAll();
					for (int i=0; i<room2.size(); i++) 
					{    System.out.println(room2.get(i).toString());    }
				    System.out.println("---------------------------------");
					break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search Room By Room-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Room-ID: ");
				RoomData roomdata3 = new RoomData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 Room room3 = roomdata3.Search(x);
				 System.out.println(room3.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("    Search Room By Room-Type     ");
				System.out.println("---------------------------------");
				System.out.print("Enter Room-Type: ");
				Scanner search1=new Scanner(System.in);
				String x1=search1.nextLine();
				RoomData roomdata4 = new RoomData();
				List<Room> room4 = roomdata4.FindAll();
				room4= roomdata4.Search1(x1);
				for (int i=0; i<room4.size(); i++)	
				    {    System.out.println(room4.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("    Search Room By Block-Name     ");
				System.out.println("---------------------------------");
				System.out.print("Enter Block-Name: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				RoomData roomdata5 = new RoomData();
				List<Room> room5 = roomdata5.FindAll();
				room5= roomdata5.Search2(x2);
				for (int i=0; i<room5.size(); i++)	
				    {    System.out.println(room5.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("      Delete Room By Room-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter Room-ID: ");
				int delete = scan.nextInt();
				Room room6 = RoomData.DelOne(delete);
				System.out.println(room6.toString());
				System.out.println("---------------------------------");
				break;
			case 6:
				System.out.println("---------------------------------");
				System.out.println("      Delete All Rooms           ");
				System.out.println("---------------------------------");
				String room7 = RoomData.DelAll(); 
			      System.out.println(room7); 
				break;
			  case 7:
				    System.out.println("---------------------------------");
					System.out.println("        Insert Room Row          ");
					System.out.println("---------------------------------");
					Room room1 = new Room();
					System.out.print("Enter Room Type: ");
					String code = scan.nextLine();
					code+=scan.nextLine();
					room1.setROOM_TYPE(code);
					System.out.print("Enter Block Name: ");
					String name = scan.nextLine();
					room1.setBLOCK_NAME(name);
					System.out.print("Enter Room Floor: ");
					int startdate = scan.nextInt();
					room1.setROOM_FLOOR(startdate);
					System.out.print("Enter Room Capacity: ");
					int capacity = scan.nextInt();
					room1.setROOM_CAPACITY(capacity);
					room1 = RoomData.Save(room1);
					System.out.println(room1.toString());
					System.out.println("---------------------------------");
					break;				
			case 8:
				System.out.println("---------------------------------");
				System.out.println("            Exit                ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}