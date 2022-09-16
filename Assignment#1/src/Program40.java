public class Program40 
{
	public static void main(String[] args) 
	{
		Integer age = 16;        
        switch (age)  
        {  
            case (16):            
                System.out.println("You are not eligible for vote.");  
                break;  
            case (20):                
                System.out.println("You are eligible for vote.");  
                break;  
            case (60):                
                System.out.println("You are eligible for vote.");  
                break;  
            default:  
                System.out.println("Please give the valid age.");  
                break;  
        }             
	}
}