package uog.edu.teacher;
import java.util.List;
import java.util.Scanner;

import uog.edu.course.CourseData;
import uog.edu.timetable.SemesterData;
public class TeacherCourseInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void TeacherCourseMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=======================================================");
			System.out.println("                  TeacherCourses Menu                  ");
			System.out.println("=======================================================");
			System.out.println("1.   Show All TeacherCourses Data");
			System.out.println("2.   Search TeacherCourses By TeacherCourse-ID");
			System.out.println("3.   Search TeacherCourses By Teacher-ID");
			System.out.println("4.   Delete TeacherCourse By Section");
			System.out.println("5.   Search TeacherCourses By Course-ID");
			System.out.println("6.   Search TeacherCourses By Semester-ID");
			System.out.println("7.   Delete TeacherCourses By TeacherCourse-ID");
			System.out.println("8.   Delete All TeacherCourses Data");
			System.out.println("9.   Insert TeacherCourse Row");
			System.out.println("10.  Quit TeacherCourse");
			System.out.print("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("----------------------------------------------------");
				System.out.println("              Show All TeacherCourses Data          ");
				System.out.println("---------------------------------");
				List<TeacherCourse> TeacherCourse2 = TeacherCourseData.FindAll();
				for (int i=0; i<TeacherCourse2.size(); i++) 
				    {    System.out.println(TeacherCourse2.get(i).toString());    }
				System.out.println("----------------------------------------------------");
				break;
			case 2:
				System.out.println("----------------------------------------------------");
				System.out.println("       Search TeacherCourse By TeacherCourse-ID     ");
				System.out.println("----------------------------------------------------");
				System.out.print("Enter TeacherCourse-ID: ");
				TeacherCourseData TeacherCoursedata3 = new TeacherCourseData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 TeacherCourse TeacherCourse3 = TeacherCoursedata3.Search(x);
				 System.out.println(TeacherCourse3.toString());
				 System.out.println("----------------------------------------------------");
				break;
			case 3:
				System.out.println("-----------------------------------------------------");
				System.out.println("          Search TeacherCourses By Teacher-ID        ");
				System.out.println("-----------------------------------------------------");
				System.out.print("Enter Teacher-ID: ");
				TeacherCourseData teachercoursedata4 = new TeacherCourseData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 TeacherCourse TeacherCourse4 = teachercoursedata4.Search1(x1);
				 System.out.println(TeacherCourse4.toString());
				 System.out.println("-----------------------------------------------------");
				break;
			case 4:
				System.out.println("-----------------------------------------------------");
				System.out.println("            Search TeacherCourses By Section         ");
				System.out.println("-----------------------------------------------------");
				System.out.print("Enter Section: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				TeacherCourseData teachercoursedata5 = new TeacherCourseData();
				List<TeacherCourse> teachercourse5 = teachercoursedata5.FindAll();
				teachercourse5= teachercoursedata5.Search2(x2);
				for (int i=0; i<teachercourse5.size(); i++)	
				    {    System.out.println(teachercourse5.get(i).toString());    }
				System.out.println("-----------------------------------------------------");
				break;
			case 5:
				System.out.println("-----------------------------------------------------");
				System.out.println("           Search TeacherCourses By Course-ID        ");
				System.out.println("-----------------------------------------------------");
				System.out.print("Enter Course-ID: ");
				TeacherCourseData teachercoursedata6 = new TeacherCourseData();
				Scanner search3=new Scanner(System.in);
				int x3=search3.nextInt();
				 TeacherCourse TeacherCourse6 = teachercoursedata6.Search3(x3);
				 System.out.println(TeacherCourse6.toString());
				 System.out.println("-----------------------------------------------------");
				break;
			case 6:
				System.out.println("------------------------------------------------------");
				System.out.println("        Search TeacherCourses By Semester-ID          ");
				System.out.println("------------------------------------------------------");
				System.out.print("Enter Semester-ID: ");
				TeacherCourseData teachercoursedata7 = new TeacherCourseData();
				Scanner search4=new Scanner(System.in);
				int x4=search4.nextInt();
				 TeacherCourse TeacherCourse7 = teachercoursedata7.Search4(x4);
				 System.out.println(TeacherCourse7.toString());
				 System.out.println("-----------------------------------------------------");
				break;
			case 7:
				System.out.println("------------------------------------------------------");
				System.out.println("      Delete TeacherCourse By TeacherCourse-ID        ");
				System.out.println("------------------------------------------------------");
				System.out.print("Enter TeacherCourse-ID: ");
				int delete = scan.nextInt();
				TeacherCourse TeacherCourse10 = TeacherCourseData.DelOne(delete);
				System.out.println(TeacherCourse10.toString());
				System.out.println("-----------------------------------------------------");
				break;
			case 8:
				System.out.println("-----------------------------------------------------");
				System.out.println("            Delete All TeacherCourses                ");
				System.out.println("-----------------------------------------------------");
				String TeacherCourse11 = TeacherCourseData.DelAll(); 
			      System.out.println(TeacherCourse11); 
				break;
			case 9:
				System.out.println("-----------------------------------------------------");
				System.out.println("              Insert TeacherCourse Row               ");
				System.out.println("-----------------------------------------------------");
				TeacherCourse teachercourse1 = new TeacherCourse();
				System.out.print("Enter Teacher-ID: ");
				int teacher_id = scan.nextInt();
				teachercourse1.setTEACHER_ID(TeacherData.Search(teacher_id));
				System.out.print("Enter Section: ");
				String section = scan.nextLine();
				section+=scan.nextLine();
				teachercourse1.setSECTION(section);
				System.out.print("Enter Course-ID: ");
				int course_id = scan.nextInt();
				teachercourse1.setCOURSE_ID(CourseData.Search(course_id));
				System.out.print("Enter Semester-ID: ");
				int semester_id = scan.nextInt();
				teachercourse1.setSEMESTER_ID(SemesterData.Search(semester_id));
				teachercourse1 = TeacherCourseData.Save(teachercourse1);
				System.out.println(teachercourse1.toString());
				System.out.println("-----------------------------------------------------");
				break;
			case 10:
				System.out.println("-----------------------------------------------------");
				System.out.println("                Exit TeacherCourses                  ");
				System.out.println("-----------------------------------------------------");
				break;
			}
		}
	}	
}