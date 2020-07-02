package uog.edu.student;
import java.util.List;

import java.util.Scanner;

import uog.edu.person.PersonData;
public class StudentInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void StudentMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  Students Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All Students Data");
			System.out.println("2.  Search Students By Student-ID");
			System.out.println("3.  Search Students By Student-RollNo");
			System.out.println("4.  Search Students By Study-Program");
			System.out.println("5.  Search Students By Study-Year");
			System.out.println("6.  Delete Student By Student-ID");
			System.out.println("7.  Delete All Students Data");
			System.out.println("8.  Insert Student Row");
			System.out.println("9.  Quit Student");
			System.out.print("Enter Your Choice [1-9]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("---------------------------------");
				System.out.println("       Show All Students Data       ");
				System.out.println("---------------------------------");
				List<Student> Student2 = StudentData.FindAll();
				for (int i=0; i<Student2.size(); i++) 
				    {    System.out.println(Student2.get(i).toString());    }
			    System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search Student By Student-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Student-ID: ");
				StudentData Studentdata3 = new StudentData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 Student Student3 = Studentdata3.Search(x);
				 System.out.println(Student3.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("------------------------------------------");
				System.out.println("        Search Students By Student-RollNo     ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Student-RollNo: ");
				StudentData Studentdata4 = new StudentData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 Student Student4 = Studentdata4.Search1(x1);
				 System.out.println(Student4.toString());
				 System.out.println("-------------------------------");
				break;
			case 4:
				System.out.println("------------------------------------------");
				System.out.println("        Search Students By Study-Program      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Study-Program: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				StudentData studentdata5 = new StudentData();
				List<Student> student5 = studentdata5.FindAll();
				student5= studentdata5.Search2(x2);
				for (int i=0; i<student5.size(); i++)	
				    {    System.out.println(student5.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("------------------------------------------");
				System.out.println("        Search Students By Study-Year      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Study-Year: ");
				StudentData Studentdata6 = new StudentData();
				Scanner search3=new Scanner(System.in);
				int x3=search3.nextInt();
				 Student Student6 = Studentdata6.Search3(x3);
				 System.out.println(Student6.toString());
				 System.out.println("-------------------------------");
				break;
			case 6:
				System.out.println("---------------------------------");
				System.out.println("      Delete Student By Student-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter Student-ID: ");
				int delete = scan.nextInt();
				Student Student7 = StudentData.DelOne(delete);
				System.out.println(Student7.toString());
				System.out.println("---------------------------------");
				break;
			case 7:
				System.out.println("---------------------------------");
				System.out.println("      Delete All Students           ");
				System.out.println("---------------------------------");
				String Student8 = StudentData.DelAll(); 
			      System.out.println(Student8); 
				break;
			case 8:
			    System.out.println("---------------------------------");
				System.out.println("        Insert Student Row          ");
				System.out.println("---------------------------------");
				Student student1 = new Student();
				System.out.print("Enter Student-RollNo: ");
				String rollno = scan.nextLine();
				rollno+=scan.nextLine();
				student1.setSTUDENT_ROLLNO(rollno);
				System.out.print("Enter Person-ID: ");
				int person_id = scan.nextInt();
				student1.setPERSON_ID(PersonData.Search(person_id));
				System.out.print("Enter Study Program: ");
				String program = scan.nextLine();
				student1.setSTUDY_PROGRAM(program);
				System.out.print("Enter Study Year: ");
				int year = scan.nextInt();
				student1.setSTUDY_YEAR(year);
				student1 = StudentData.Save(student1);
				System.out.println(student1.toString());
				System.out.println("---------------------------------");
				break;
			case 9:
				System.out.println("---------------------------------");
				System.out.println("      Exit Students           ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}