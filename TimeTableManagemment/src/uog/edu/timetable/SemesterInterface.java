package uog.edu.timetable;
import java.util.List;
import java.util.Scanner;
public class SemesterInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void SemesterMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  Semesters Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All Semesters Data");
			System.out.println("2.  Search Semester By Semester-ID");
			System.out.println("3.  Search Semesters By Semester-Code");
			System.out.println("4.  Search Semesters By Semester-Name");
			System.out.println("5.  Delete Semester By Semester-ID");
			System.out.println("6.  Delete All Semesters Data");
			System.out.println("7.  Insert Semester Row");
			System.out.println("8.  Quit Semester");;
			System.out.print("Enter Your Choice [1-8]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			 case 1:
				 System.out.println("---------------------------------");
					System.out.println("       Show All Semesters Data       ");
					System.out.println("---------------------------------");
					List<Semester> semester1 = SemesterData.FindAll();
					for (int i=0; i<semester1.size(); i++) 
					    {    System.out.println(semester1.get(i).toString());    }
				    System.out.println("---------------------------------");
					break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search Semester By Semester-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Semester-ID: ");
				SemesterData semesterdata3 = new SemesterData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 Semester semester3 = semesterdata3.Search(x1);
				 System.out.println(semester3.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("    Search Semesters By Semester-Code     ");
				System.out.println("---------------------------------");
				System.out.print("Enter Semester-Code: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				SemesterData semesterdata4 = new SemesterData();
				List<Semester> semester4 = semesterdata4.FindAll();
				semester4= semesterdata4.Search1(x2);
				for (int i=0; i<semester4.size(); i++)	
				    {    System.out.println(semester4.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("    Search Semesters By Semester-Name     ");
				System.out.println("---------------------------------");
				System.out.print("Enter Semester-Name: ");
				Scanner search3=new Scanner(System.in);
				String x3=search3.nextLine();
				SemesterData semesterdata5 = new SemesterData();
				List<Semester> semester5 = semesterdata5.FindAll();
				semester5= semesterdata5.Search2(x3);
				for (int i=0; i<semester5.size(); i++)	
				    {    System.out.println(semester5.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("      Delete Semester By ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter Semester-ID: ");
				int delete = scan.nextInt();
				Semester semester6 = SemesterData.DelOne(delete);
				System.out.println(semester6.toString());
				System.out.println("---------------------------------");
				break;
			case 6:
				System.out.println("---------------------------------");
				System.out.println("      Delete All Semesters           ");
				System.out.println("---------------------------------");
				String semester7 = SemesterData.DelAll(); 
			      System.out.println(semester7); 
				break;
			  case 7:
				  System.out.println("---------------------------------");
					System.out.println("        Insert Semester Row          ");
					System.out.println("---------------------------------");
					Semester semester2 = new Semester();
					System.out.print("Enter Semester Code: ");
					String code = scan.nextLine();
					code+=scan.nextLine();
					semester2.setSEMESTER_CODE(code);
					System.out.print("Enter Semester Name: ");
					String name = scan.nextLine();
					semester2.setSEMESTER_NAME(name);
					System.out.print("Enter Semester StartDate: ");
					String startdate = scan.nextLine();
					semester2.setSEMESTER_STARTDATE(startdate);
					System.out.print("Enter Semester EndDate: ");
					String enddate = scan.nextLine();
					semester2.setSEMESTER_ENDDATE(enddate);
					semester2 = SemesterData.Save(semester2);
					System.out.println(semester2.toString());
					System.out.println("---------------------------------");
					break;
			case 8:
				System.out.println("---------------------------------");
				System.out.println("             Exit                ");
				System.out.println("---------------------------------");
				
				break;
			}
		}
	}	
}