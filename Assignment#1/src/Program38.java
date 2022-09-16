public class Program38 
{
	public static void main(String[] args) 
	{
		char block = 'S';                 
        int department = 2;  
        switch(block)  
        {  
            case 'B':  
            	switch(department)   
                {  
                    case 1:  
                        System.out.println("Department of Computer science");  
                        break;  
                    case 2:  
                        System.out.println("Department of Information Technoogy");  
                        break;  
                    case 3:  
                        System.out.println("Department of Software Engineering");  
                        break;  
                }  
                break;   
            case 'S':  
            	switch(department)   
                {  
                    case 1:  
                        System.out.println("Department of Mathmatics");  
                        break;  
                    case 2:  
                        System.out.println("Department of Physics");  
                        break;  
                    case 3:  
                        System.out.println("Department of statistics");  
                        break;  
                }  
                break;   
            case 'Z':  
            	switch(department)   
                {  
                    case 1:  
                        System.out.println("Department of Econmic");  
                        break;  
                    case 2:  
                        System.out.println("Department of English");  
                        break;  
                    case 3:  
                        System.out.println("Department of Bachelor of Business Administration");  
                        break;  
                }  
                break; 
            default:
		    	System.out.println("Invalid Input!");
        }  
	}
}