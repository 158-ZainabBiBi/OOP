package uog.edu;
import java.util.Scanner;
import uog.edu.campus.RoomInterface;
import uog.edu.course.CourseInterface;
import uog.edu.model.ModelInterface;
import uog.edu.person.PersonInterface;
import uog.edu.student.StudentCourseInterface;
import uog.edu.student.StudentInterface;
import uog.edu.teacher.TeacherCourseInterface;
import uog.edu.teacher.TeacherInterface;
import uog.edu.timetable.SemesterInterface;
import uog.edu.timetable.TimeSlotInterface;
import uog.edu.timetable.TimeTableInterface;
import uog.edu.timetable.WeekDayInterface;
public class TimeTableManagement 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice=-1;
		while (choice!=10) 
		{
			MainMenu();
			choice = scan.nextInt();
			switch (choice) 
			{
			case 1:
				RoomInterface.RoomMenu();
				choice=-1;
				break;
			case 2:
				CourseInterface.CourseMenu();
				choice=-1;
				break;
			case 3:
				PersonInterface.PersonMenu();
				choice=-1;
				break;
			case 4:
				StudentInterface.StudentMenu();
				choice=-1;
				break;
			case 5:
				StudentCourseInterface.StudentCourseMenu();
				choice=-1;
				break;
			case 6:
				TeacherInterface.TeacherMenu();
				choice=-1;
				break;
			case 7:
				TeacherCourseInterface.TeacherCourseMenu();
				choice=-1;
				break;
			case 8:
				SemesterInterface.SemesterMenu();
				choice=-1;
				break;
			case 9:
				WeekDayInterface.WeekDayMenu();
				choice=-1;
				
				break;
			case 10:
				TimeSlotInterface.TimeSlotMenu();
				choice=-1;
				break;
			case 11:
				TimeTableInterface.TimeTableMenu();
				choice=-1;
				break;
			case 12:
				ModelInterface.ModelMenu();
				choice=-1;
				break;
		       }
			}
	}
	static void MainMenu() 
	{
		System.out.println("=====================================================");
		System.out.println("                   Main Menu");
		System.out.println("=====================================================");
		System.out.println("1.   Rooms Data");
		System.out.println("2.   Courses Data");
		System.out.println("3.   Persons Data");
		System.out.println("4.   Students Data");
		System.out.println("5.   StudentCourse Data");
		System.out.println("6.   Teachers Data");
		System.out.println("7.   TeacherCourse Data");
		System.out.println("8.   Semesters Data");
		System.out.println("9.   WeekDay Data");
		System.out.println("10.  TimeSlots Data");
		System.out.println("11.  TimeTabless Data");
		System.out.println("12.  Models Data");
		System.out.print("Enter Your Choice[1-12]: ");
	}
	
}