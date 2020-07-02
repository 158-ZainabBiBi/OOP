package uog.edu.teacher;
import java.util.List;

import java.util.Scanner;

import uog.edu.person.PersonData;
public class TeacherInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void TeacherMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=======================================================");
			System.out.println("                   Teachers Menu                       ");
			System.out.println("=======================================================");
			System.out.println("1.  Show All Teachers Data");
			System.out.println("2.  Search Teachers By Teacher-ID");
			System.out.println("3.  Search Teachers By Teacher-Grade");
			System.out.println("4.  Delete Teacher By Teacher-ID");
			System.out.println("5.  Delete All Teachers Data");
			System.out.println("6.  Insert Teacher Row");
			System.out.println("7.  Quit Teacher");
			System.out.print("Enter Your Choice [1-7]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("----------------------------------------------------");
				System.out.println("                Show All Teachers Data              ");
				System.out.println("----------------------------------------------------");
				List<Teacher> Teacher2 = TeacherData.FindAll();
				for (int i=0; i<Teacher2.size(); i++) 
				    {    System.out.println(Teacher2.get(i).toString());    }
				System.out.println("----------------------------------------------------");
				break;
			case 2:
				System.out.println("----------------------------------------------------");
				System.out.println("            Search Teacher By Teacher-ID            ");
				System.out.println("----------------------------------------------------");
				System.out.print("Enter Teacher-ID: ");
				TeacherData Teacherdata3 = new TeacherData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 Teacher Teacher3 = Teacherdata3.Search(x);
				 System.out.println(Teacher3.toString());
				 System.out.println("---------------------------------------------------");
				break;
			case 3:
				System.out.println("----------------------------------------------------");
				System.out.println("          Search Teachers By Teacher-Grade          ");
				System.out.println("----------------------------------------------------");
				System.out.print("Enter Teacher-Grade: ");
				Scanner search1=new Scanner(System.in);
				String x1=search1.nextLine();
				TeacherData studentdata3 = new TeacherData();
				List<Teacher> student3 = studentdata3.FindAll();
				student3= studentdata3.Search1(x1);
				for (int i=0; i<student3.size(); i++)	
				    {    System.out.println(student3.get(i).toString());    }
				System.out.println("----------------------------------------------------");
				break;
			case 4:
				System.out.println("----------------------------------------------------");
				System.out.println("             Delete Teacher By Teacher-ID           ");
				System.out.println("----------------------------------------------------");
				System.out.print("Enter Teacher-ID: ");
				int delete = scan.nextInt();
				Teacher Teacher4 = TeacherData.DelOne(delete);
				System.out.println(Teacher4.toString());
				System.out.println("----------------------------------------------------");
				break;
			case 5:
				System.out.println("----------------------------------------------------");;
				System.out.println("                   Delete All Teachers              ");
				System.out.println("----------------------------------------------------");
				String Teacher5 = TeacherData.DelAll(); 
			      System.out.println(Teacher5); 
				break;
			case 6:
				System.out.println("----------------------------------------------------");
				System.out.println("                  Insert Teacher Row                ");
				System.out.println("----------------------------------------------------");
				Teacher student1 = new Teacher();
				System.out.print("Enter Person-ID: ");
				int person_id = scan.nextInt();
				student1.setPERSON_ID(PersonData.Search(person_id));
				System.out.print("Enter Teacher Grade: ");
				String grade = scan.nextLine();
				grade+=scan.nextLine();
				student1.setTEACHER_GRADE(grade);
				student1 = TeacherData.Save(student1);
				System.out.println(student1.toString());
				System.out.println("----------------------------------------------------");
				break;	
			case 7:
				System.out.println("----------------------------------------------------");
				System.out.println("                     Exit Teachers                  ");
				System.out.println("----------------------------------------------------");
				break;
			}
		}
	}	
}