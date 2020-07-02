package uog.edu.course;
import java.util.List;
import java.util.Scanner;
public class CourseInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void CourseMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  Courses Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All Courses Data");
			System.out.println("2.  Search Course By Course-ID");
			System.out.println("3.  Search Course By Course-Code");
			System.out.println("4.  Search Course By Course-Disc");
			System.out.println("5.  Delete Course By Course-ID");
			System.out.println("6.  Delete All Courses Data");
			System.out.println("7.  Insert Course Row");
			System.out.println("8.  Quit Course");
			System.out.print("Enter Your Choice [1-8]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			 case 2:
				    System.out.println("---------------------------------");
					System.out.println("       Show All Courses Data       ");
					System.out.println("---------------------------------");
					List<Course> room2 = CourseData.FindAll();
					for (int i=0; i<room2.size(); i++) 
					{    System.out.println(room2.get(i).toString());    }
				    System.out.println("---------------------------------");
					break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("       Search Course By Course-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Course-ID: ");
				CourseData roomdata3 = new CourseData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 Course room3 = roomdata3.Search(x);
				 System.out.println(room3.toString());
				 System.out.println("-------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("    Search Course By Course-Code     ");
				System.out.println("---------------------------------");
				System.out.print("Enter Course-Code: ");
				Scanner search1=new Scanner(System.in);
				String x1=search1.nextLine();
				CourseData coursedata4 = new CourseData();
				List<Course> course4 = coursedata4.FindAll();
				course4= coursedata4.Search1(x1);
				for (int i=0; i<course4.size(); i++)	
				    {    System.out.println(course4.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("    Search Course By Course-Disc     ");
				System.out.println("---------------------------------");
				System.out.print("Enter Course-Disc: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				CourseData coursedata5 = new CourseData();
				List<Course> course5 = coursedata5.FindAll();
				course5= coursedata5.Search2(x2);
				for (int i=0; i<course5.size(); i++)	
				    {    System.out.println(course5.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 6:
				System.out.println("---------------------------------");
				System.out.println("      Delete Course By Course-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter Course-ID: ");
				int delete = scan.nextInt();
				Course room6 = CourseData.DelOne(delete);
				System.out.println(room6.toString());
				System.out.println("---------------------------------");
				break;
			case 7:
				System.out.println("---------------------------------");
				System.out.println("      Delete All Courses           ");
				System.out.println("---------------------------------");
				String room7 = CourseData.DelAll(); 
			      System.out.println(room7); 
				break;
			case 8:
				  System.out.println("-----------------------------------------");
					System.out.println("           Insert Course Row             ");
					System.out.println("-----------------------------------------");
					Course course2 = new Course();
					System.out.print("Enter Course Code: ");
					String code = scan.nextLine();
					code+=scan.nextLine();
					course2.setCOURSE_CODE(code);
					System.out.print("Enter Course Title: ");
					String title = scan.nextLine();
					course2.setCOURSE_TITLE(title);
					System.out.print("Enter Course Desc: ");
					String desc = scan.nextLine();
					course2.setCOURSE_DESC(desc);
					System.out.print("Enter Course CreditHour: ");
					int credithour = scan.nextInt();
					course2.setCOURSE_CREDITHOUR(credithour);
					System.out.print("Enter Course Prerequist-ID: ");
					int prerequist = scan.nextInt();
					course2.setCOURSEPREREQUIST_ID(CourseData.Search(prerequist));
					course2 = CourseData.Save(course2);
					System.out.println(course2.toString());
					System.out.println("------------------------------------------");
					break;				
			case 9:
				System.out.println("---------------------------------");
				System.out.println("             Exit                ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}