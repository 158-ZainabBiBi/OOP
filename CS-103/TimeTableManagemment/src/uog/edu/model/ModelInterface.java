package uog.edu.model;
import java.util.List;
import java.util.Scanner;
public class ModelInterface 
{
	@SuppressWarnings({ "static-access", "resource" })
	public static void ModelMenu() 
	{
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		choice = -1;
		while (choice!=10) 
		{
			System.out.println("=====================================================");
			System.out.println("                  Models Menu                         ");
			System.out.println("=====================================================");
			System.out.println("1.  Show All Models Data");
			System.out.println("2.  Search Model By Model-ID");
			System.out.println("3.  Delete Model By Model-ID");
			System.out.println("4.  Delete All Models Data");
			System.out.println("5.  Quit Model");
			System.out.print("Enter Your Choice [1-5]: ");
			choice = scan.nextInt();
			switch (choice) 
			{
			 case 1:
				    System.out.println("---------------------------------");
					System.out.println("       Show All Models Data       ");
					System.out.println("---------------------------------");
					List<Model> model2 = ModelData.FindAll();
					for (int i=0; i<model2.size(); i++) 
					{    System.out.println(model2.get(i).toString());    }
				    System.out.println("---------------------------------");
					break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("       Search Model By Model-ID         ");
				System.out.println("---------------------------------");
				System.out.print("Enter Model-ID: ");
				ModelData modeldata3 = new ModelData();
				Scanner search=new Scanner(System.in);
				int x=search.nextInt();
				 Model model3 = modeldata3.Search(x);
				 System.out.println(model3.toString());
				 System.out.println("-------------------------------");
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("      Delete Model By ID          ");
				System.out.println("---------------------------------");
				System.out.print("Enter Model-ID: ");
				int delete = scan.nextInt();
				Model model6 = ModelData.DelOne(delete);
				System.out.println(model6.toString());
				System.out.println("---------------------------------");
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("      Delete All Models           ");
				System.out.println("---------------------------------");
				String model7 = ModelData.DelAll(); 
			      System.out.println(model7); 
				break;			
			case 5:
				System.out.println("---------------------------------");
				System.out.println("            Exit                ");
				System.out.println("---------------------------------");
				break;
			}
		}
	}	
}