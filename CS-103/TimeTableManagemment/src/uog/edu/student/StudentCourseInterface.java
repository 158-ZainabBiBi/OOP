package uog.edu.student;
import java.util.List;
import java.util.Scanner;

import uog.edu.course.CourseData;
import uog.edu.timetable.SemesterData;
public class StudentCourseInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void StudentCourseMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=======================================================");
			System.out.println("                  StudentCourses Menu                  ");
			System.out.println("=======================================================");
			System.out.println("1.  Show All StudentCourses Data");
			System.out.println("2.  Search StudentCourses By StudentCourse-ID");
			System.out.println("3.  Search StudentCourses By Student-ID");
			System.out.println("4.  Search StudentCourse By Section");
			System.out.println("5.  Search StudentCourses By Course-ID");
			System.out.println("6.  Search StudentCourses By Semester-ID");
			System.out.println("7.  Delete StudentCourses By StudentCourse-ID");
			System.out.println("8.  Delete All StudentCourses Data");
			System.out.println("9.  Quit StudentCourse");
			System.out.println("10. Insert StudentCourse Row");
			System.out.print("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("---------------------------------");
				System.out.println("       Show All StudentCourses Data       ");
				System.out.println("---------------------------------");
				List<StudentCourse> StudentCourse2 = StudentCourseData.FindAll();
				for (int i=0; i<StudentCourse2.size(); i++) 
				    {    System.out.println(StudentCourse2.get(i).toString());    }
			    System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search StudentCourse By StudentCourse-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter StudentCourse-ID: ");
				StudentCourseData StudentCoursedata3 = new StudentCourseData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 StudentCourse StudentCourse3 = StudentCoursedata3.Search(x);
				 System.out.println(StudentCourse3.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("------------------------------------------");
				System.out.println("        Search StudentCourses By Student-ID      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Student-ID: ");
				StudentCourseData studentcoursedata4 = new StudentCourseData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 StudentCourse StudentCourse4 = studentcoursedata4.Search1(x1);
				 System.out.println(StudentCourse4.toString());
				 System.out.println("-------------------------------");
				break;
			case 4:
				System.out.println("------------------------------------------");
				System.out.println("        Search StudentCourses By Section      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Section: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				StudentCourseData studentcoursedata5 = new StudentCourseData();
				List<StudentCourse> studentcourse5 = studentcoursedata5.FindAll();
				studentcourse5= studentcoursedata5.Search2(x2);
				for (int i=0; i<studentcourse5.size(); i++)	
				    {    System.out.println(studentcourse5.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("------------------------------------------");
				System.out.println("        Search StudentCourses By Course-ID      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Course-ID: ");
				StudentCourseData studentcoursedata6 = new StudentCourseData();
				Scanner search3=new Scanner(System.in);
				int x3=search3.nextInt();
				 StudentCourse StudentCourse6 = studentcoursedata6.Search3(x3);
				 System.out.println(StudentCourse6.toString());
				 System.out.println("-------------------------------");
				break;
			case 6:
				System.out.println("---------------------------------");
				System.out.println("       Search StudentCourses By Semester-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Semester-ID: ");
				StudentCourseData studentcoursedata7 = new StudentCourseData();
				Scanner search4=new Scanner(System.in);
				int x4=search4.nextInt();
				 StudentCourse StudentCourse7 = studentcoursedata7.Search4(x4);
				 System.out.println(StudentCourse7.toString());
				 System.out.println("-------------------------------");
				break;
			case 7:
				System.out.println("---------------------------------");
				System.out.println("      Delete StudentCourse By StudentCourse-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter StudentCourse-ID: ");
				int delete = scan.nextInt();
				StudentCourse StudentCourse10 = StudentCourseData.DelOne(delete);
				System.out.println(StudentCourse10.toString());
				System.out.println("---------------------------------");
				break;
			case 8:
				System.out.println("---------------------------------");
				System.out.println("      Delete All StudentCourses           ");
				System.out.println("---------------------------------");
				String StudentCourse11 = StudentCourseData.DelAll(); 
			      System.out.println(StudentCourse11); 
				break;
			case 9:
				System.out.println("---------------------------------");
				System.out.println("        Insert StudentCourse Row          ");
				System.out.println("---------------------------------");
				StudentCourse studentcourse1 = new StudentCourse();
				System.out.print("Enter Student-ID: ");
				int student_id = scan.nextInt();
				studentcourse1.setSTUDENT_ID(StudentData.Search(student_id));
				System.out.print("Enter Section: ");
				String section = scan.nextLine();
				section+=scan.nextLine();
				studentcourse1.setSECTION(section);
				System.out.print("Enter Course-ID: ");
				int course_id = scan.nextInt();
				studentcourse1.setCOURSE_ID(CourseData.Search(course_id));
				System.out.print("Enter Semester-ID: ");
				int semester_id = scan.nextInt();
				studentcourse1.setSEMESTER_ID(SemesterData.Search(semester_id));
				studentcourse1 = StudentCourseData.Save(studentcourse1);
				System.out.println(studentcourse1.toString());
				System.out.println("---------------------------------");
				break;
			case 10:
				System.out.println("---------------------------------");
				System.out.println("      Exit StudentCourses           ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}