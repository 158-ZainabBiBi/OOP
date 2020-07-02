package uog.edu.timetable;
import java.util.List;
import java.util.Scanner;

import uog.edu.campus.RoomData;
import uog.edu.teacher.TeacherCourseData;
public class TimeTableInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void TimeTableMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  TimeTables Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All TimeTables Data");
			System.out.println("3.  Search TimeTables By TimeTable-ID");
			System.out.println("4.  Search TimeTables By TimeSlot-ID");
			System.out.println("5.  Search TimeTables By TeachherCourse-ID");
			System.out.println("6.  Search TimeTables By Room-ID");
			System.out.println("7.  Search TimeTables By Semester-ID");
			System.out.println("8.  Delete TimeTable By TimeTable-ID");
			System.out.println("9.  Delete All TimeTables Data");
			System.out.println("10.  Insert TimeTable Row");
			System.out.println("11.  Quit TimeTable");
			System.out.print("Enter Your Choice [1-11]: ");
			choice = scan.nextInt();
			switch (choice) 
			{

			case 1:
				System.out.println("---------------------------------");
				System.out.println("       Show All TimeTables Data       ");
				System.out.println("---------------------------------");
				List<TimeTable> TimeTable1 = TimeTableData.FindAll();
				for (int i=0; i<TimeTable1.size(); i++) 
				    {    System.out.println(TimeTable1.get(i).toString());    }
			    System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search TimeTable By TimeTable-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter TimeTable-ID: ");
				TimeTableData timetabledata2 = new TimeTableData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 TimeTable timetable2 = timetabledata2.Search(x);
				 System.out.println(timetable2.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("------------------------------------------");
				System.out.println("        Search TimeTables By TimeSlot-ID      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter TimeSlot-ID: ");
				TimeTableData TimeTabledata3 = new TimeTableData();
				Scanner search1=new Scanner(System.in);
				int x1=search1.nextInt();
				 TimeTable TimeTable3 = TimeTabledata3.Search1(x1);
				 System.out.println(TimeTable3.toString());
				 System.out.println("-------------------------------");
				break;
			case 4:
				System.out.println("------------------------------------------");
				System.out.println("        Search TimeTables By TeachherCourse-ID      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter TeachherCourse-ID: ");
				TimeTableData TimeTabledata4 = new TimeTableData();
				Scanner search2=new Scanner(System.in);
				int x2=search2.nextInt();
				 TimeTable TimeTable4 = TimeTabledata4.Search2(x2);
				 System.out.println(TimeTable4.toString());
				 System.out.println("-------------------------------");
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("       Search TimeTables By Room-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Room-ID: ");
				TimeTableData TimeTabledata5 = new TimeTableData();
				Scanner search3=new Scanner(System.in);
				int x3=search3.nextInt();
				 TimeTable TimeTable5 = TimeTabledata5.Search3(x3);
				 System.out.println(TimeTable5.toString());
				 System.out.println("-------------------------------");
				break;
			case 6:
				System.out.println("------------------------------------------");
				System.out.println("        Search TimeTables By Semester-ID      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Semester-ID: ");
				TimeTableData TimeTabledata6 = new TimeTableData();
				Scanner search4=new Scanner(System.in);
				int x4=search4.nextInt();
				 TimeTable TimeTable6 = TimeTabledata6.Search4(x4);
				 System.out.println(TimeTable6.toString());
				 System.out.println("-------------------------------");
				break;
			case 7:
				System.out.println("---------------------------------");
				System.out.println("      Delete TimeTable By TimeTable-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter TimeTable-ID: ");
				int delete = scan.nextInt();
				TimeTable TimeTable10 = TimeTableData.DelOne(delete);
				System.out.println(TimeTable10.toString());
				System.out.println("---------------------------------");
				break;
			case 8:
				System.out.println("---------------------------------");
				System.out.println("      Delete All TimeTables           ");
				System.out.println("---------------------------------");
				String TimeTable11 = TimeTableData.DelAll(); 
			      System.out.println(TimeTable11); 
				break;
			case 9:
				System.out.println("---------------------------------");
				System.out.println("        Insert TimeTable Row          ");
				System.out.println("---------------------------------");
				TimeTable TimeTable2 = new TimeTable();
				System.out.print("Enter TimeTable ID: ");
				int teachercourse_id = scan.nextInt();
				teachercourse_id+=scan.nextInt();
				TimeTable2.setTEACHERCOURSE_ID(TeacherCourseData.Search(teachercourse_id));
				System.out.print("Enter TimeTable timeslot_id: ");
				int timeslot_id = scan.nextInt();
				TimeTable2.setTIMESLOT_ID(TimeSlotData.Search(timeslot_id));
				System.out.print("Enter TimeTable room_id: ");
				int room_id = scan.nextInt();
				TimeTable2.setROOM_ID(RoomData.Search(room_id));
				System.out.print("Enter TimeTable semester_id: ");
				int semester_id = scan.nextInt();
				TimeTable2.setSEMESTER_ID(SemesterData.Search(semester_id));
				TimeTable2 = TimeTableData.Save(TimeTable2);
				System.out.println(TimeTable2.toString());
				System.out.println("---------------------------------");
				break;
			case 11:
				System.out.println("---------------------------------");
				System.out.println("      Exit TimeTables           ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}