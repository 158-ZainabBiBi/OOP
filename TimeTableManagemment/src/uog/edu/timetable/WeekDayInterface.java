package uog.edu.timetable;
import java.util.List;
import java.util.Scanner;
public class WeekDayInterface 
{
	@SuppressWarnings("static-access")
	public static void WeekDayMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  WeekDays Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All WeekDays Data");
			System.out.println("2.  Search WeekDays By WeekDay-ID");
			System.out.println("3.  Search WeekDays By WeekDay-Name");
			System.out.println("4.  Delete WeekDay By WeekDay-ID");
			System.out.println("5.  Delete All WeekDays Data");
			System.out.println("6.  Insert WeekDay Row");
			System.out.println("7.  Quit WeekDay");;
			System.out.print("Enter Your Choice [1-7]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			  case 1:
				System.out.println("---------------------------------");
				System.out.println("       Show All WeekDays Data       ");
				System.out.println("---------------------------------");
				List<WeekDay> WeekDay1 = WeekDayData.FindAll();
				for (int i=0; i<WeekDay1.size(); i++) 
				    {    System.out.println(WeekDay1.get(i).toString());    }
			    System.out.println("---------------------------------");
				break;

			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search WeekDay By WeekDay-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter WeekDay-ID: ");
				WeekDayData WeekDaydata3 = new WeekDayData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 WeekDay WeekDay3 = WeekDaydata3.Search(x1);
				 System.out.println(WeekDay3.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("    Search WeekDay By WeekDay-Name     ");
				System.out.println("---------------------------------");
				System.out.print("Enter WeekDay-Name: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				WeekDayData WeekDaydata4 = new WeekDayData();
				List<WeekDay> WeekDay4 = WeekDaydata4.FindAll();
				WeekDay4= WeekDaydata4.Search1(x2);
				for (int i=0; i<WeekDay4.size(); i++)	
				    {    System.out.println(WeekDay4.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("      Delete WeekDay By WeekDay-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter WeekDay ID: ");
				int delete = scan.nextInt();
				WeekDay WeekDay5 = WeekDayData.DelOne(delete);
				System.out.println(WeekDay5.toString());
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("      Delete All WeekDays           ");
				System.out.println("---------------------------------");
				String WeekDay6 = WeekDayData.DelAll(); 
			      System.out.println(WeekDay6); 
				break;
			 case 6:
				System.out.println("---------------------------------");
				System.out.println("        Insert WeekDay Row          ");
				System.out.println("---------------------------------");
				WeekDay WeekDay2 = new WeekDay();
				System.out.print("Enter WeekDay Name: ");
				String name = scan.nextLine();
				name+=scan.nextLine();
				WeekDay2.setWEEKDAY_NAME(name);
				WeekDay2 = WeekDayData.Save(WeekDay2);
				System.out.println(WeekDay2.toString());
				System.out.println("---------------------------------");
				break;
			case 7:
				System.out.println("---------------------------------");
				System.out.println("          Quit WeekDay           ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}