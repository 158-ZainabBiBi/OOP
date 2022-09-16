package uog.edu.person;
import java.util.List;
import java.util.Scanner;
public class PersonInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void PersonMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  Persons Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.   Show All Persons Data");
			System.out.println("2.   Search Persons By Person-ID");
			System.out.println("3.   Search Persons By Fore-Name");
			System.out.println("4.   Search Persons By Sur-Name");
			System.out.println("5.   Search Persons By Age");
			System.out.println("6.   Search Persons By Gender");
			System.out.println("7.   Search Persons By Address");
			System.out.println("8.   Delete Person By Person-ID");
			System.out.println("9.   Delete All Persons Data");
			System.out.println("10.  Insert Person Row");
			System.out.println("11.  Quit Person");
			System.out.print("Enter Your Choice [1-11]: ");
			choice = scan.nextInt();
			switch (choice) 
			{

			case 1:
				System.out.println("---------------------------------");
				System.out.println("       Show All Persons Data       ");
				System.out.println("---------------------------------");
				List<Person> Person2 = PersonData.FindAll();
				for (int i=0; i<Person2.size(); i++) 
				    {    System.out.println(Person2.get(i).toString());    }
			    System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search Person By Person-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Person-ID: ");
				PersonData Persondata3 = new PersonData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 Person Person3 = Persondata3.Search(x);
				 System.out.println(Person3.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("------------------------------------------");
				System.out.println("        Search Persons By Fore-Name      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Fore-Name: ");
				Scanner search2=new Scanner(System.in);
				String x2=search2.nextLine();
				PersonData persondata5 = new PersonData();
				List<Person> person5 = persondata5.FindAll();
				person5= persondata5.Search2(x2);
				for (int i=0; i<person5.size(); i++)	
				    {    System.out.println(person5.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("------------------------------------------");
				System.out.println("        Search Persons By Sur-Name      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Sur-Name: ");
				Scanner search3=new Scanner(System.in);
				String x3=search3.nextLine();
				PersonData persondata6 = new PersonData();
				List<Person> person6 = persondata6.FindAll();
				person6= persondata6.Search3(x3);
				for (int i=0; i<person6.size(); i++)	
				    {    System.out.println(person6.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("       Search Persons By Age         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Age: ");
				PersonData Persondata7 = new PersonData();
				Scanner search4=new Scanner(System.in);
				int x4=search4.nextInt();
				 Person Person7 = Persondata7.Search4(x4);
				 System.out.println(Person7.toString());
				 System.out.println("-------------------------------");
				break;
			case 6:
				System.out.println("------------------------------------------");
				System.out.println("        Search Persons By Gender      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Gender: ");
				Scanner search5=new Scanner(System.in);
				String x5=search5.nextLine();
				PersonData persondata8 = new PersonData();
				List<Person> person8 = persondata8.FindAll();
				person8= persondata8.Search5(x5);
				for (int i=0; i<person8.size(); i++)	
				    {    System.out.println(person8.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 7:
				System.out.println("------------------------------------------");
				System.out.println("        Search Persons By Address      ");
				System.out.println("------------------------------------------");
				System.out.print("Enter Address: ");
				Scanner search6=new Scanner(System.in);
				String x6=search6.nextLine();
				PersonData persondata9 = new PersonData();
				List<Person> person9 = persondata9.FindAll();
				person9= persondata9.Search6(x6);
				for (int i=0; i<person9.size(); i++)	
				    {    System.out.println(person9.get(i).toString());    }
				System.out.println("---------------------------------");
				break;
			case 8:
				System.out.println("---------------------------------");
				System.out.println("      Delete Person By Person-ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter Person-ID: ");
				int delete = scan.nextInt();
				Person Person10 = PersonData.DelOne(delete);
				System.out.println(Person10.toString());
				System.out.println("---------------------------------");
				break;
			case 9:
				System.out.println("---------------------------------");
				System.out.println("      Delete All Persons           ");
				System.out.println("---------------------------------");
				String Person11 = PersonData.DelAll(); 
			      System.out.println(Person11); 
				break;
			case 10:
				System.out.println("---------------------------------");
				System.out.println("        Insert Person Row          ");
				System.out.println("---------------------------------");
				Person Person1 = new Person();
				System.out.print("Enter Person Fore-Name: ");
				String forename = scan.nextLine();
				forename+=scan.nextLine();
				Person1.setFORE_NAME(forename);
				System.out.print("Enter Person Sur-Name: ");
				String surname = scan.nextLine();
				Person1.setSUR_NAME(surname);
				System.out.print("Enter Person Age: ");
				int age = scan.nextInt();
				Person1.setAGE(age);
				System.out.print("Enter Person Gender: ");
				String gender = scan.nextLine();
				gender+=scan.nextLine();
				Person1.setGENDER(gender);
				System.out.print("Enter Person Address: ");
				String address = scan.nextLine();
				Person1.setADDRESS(address);
				Person1 = PersonData.Save(Person1);
				System.out.println(Person1.toString());
				System.out.println("---------------------------------");
				break;
			case 11:
				System.out.println("---------------------------------");
				System.out.println("          Exit Persons           ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}