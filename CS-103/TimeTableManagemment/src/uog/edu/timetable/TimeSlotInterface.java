package uog.edu.timetable;
import java.util.List;
import java.util.Scanner;
public class TimeSlotInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void TimeSlotMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  TimeSlots Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All TimeSlots Data");
			System.out.println("2.  Insert TimeSlot Row");
			System.out.println("3.  Search TimeSlot By TimeSlot-ID");
			System.out.println("4.  Search TimeSlot By WeekDay-ID");
			System.out.println("5.  Delete TimeSlot By TimeSlot-ID");
			System.out.println("6.  Delete All TimeSlots Data");
			System.out.println("7.  Quit TimeSlot");;
			System.out.print("Enter Your Choice [1-7]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			  case 1:
				System.out.println("---------------------------------");
				System.out.println("       Show All TimeSlots Data       ");
				System.out.println("---------------------------------");
				List<TimeSlot> timeslot1 = TimeSlotData.FindAll();
				for (int i=0; i<timeslot1.size(); i++) 
				    {    System.out.println(timeslot1.get(i).toString());    }
			    System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search TimeSlot By TimeSlot-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter TimeSlot-ID: ");
				TimeSlotData timeslotdata2 = new TimeSlotData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 TimeSlot timeslot2 = timeslotdata2.Search(x);
				 System.out.println(timeslot2.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("       Search TimeSlot By WeekDay-ID        ");
				System.out.println("---------------------------------");
				System.out.print("Enter WeekDay-ID: ");
				TimeSlotData timeslotdata3 = new TimeSlotData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 TimeSlot timeslot3 = timeslotdata3.Search1(x1);
				 System.out.println(timeslot3.toString());
				 System.out.println("-------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("      Delete TimeSlot By TimeSlot-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter TimeSlot ID: ");
				int delete = scan.nextInt();
				TimeSlot timeslot4 = TimeSlotData.DelOne(delete);
				System.out.println(timeslot4.toString());
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("      Delete All TimeSlots           ");
				System.out.println("---------------------------------");
				String timeslot5 = TimeSlotData.DelAll(); 
			      System.out.println(timeslot5); 
				break;
			 case 6:
				System.out.println("---------------------------------");
				System.out.println("        Insert TimeSlot Row          ");
				System.out.println("---------------------------------");
				TimeSlot timeslot6 = new TimeSlot();
				System.out.print("Enter WeekDay: ");
				int dayid = scan.nextInt();
				dayid+=scan.nextInt();
				timeslot6.setWEEKDAY_ID(WeekDayData.Search(dayid));
				System.out.print("Enter TimeSlot Start: ");
				String startdate = scan.nextLine();
				timeslot6.setTIMESLOT_START(startdate);
				System.out.print("Enter TimeSlot End: ");
				String enddate = scan.nextLine();
				timeslot6.setTIMESLOT_END(enddate);
				timeslot6 = TimeSlotData.Save(timeslot6);
				System.out.println(timeslot6.toString());
				System.out.println("---------------------------------");
				break;
			case 7:
				System.out.println("---------------------------------");
				System.out.println("      Quit TimeSlot              ");
				System.out.println("---------------------------------");
				
				break;
			}
		}
	}	
}