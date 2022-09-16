public class Program37 
{
	public static void main(String[] args) 
	{
	    String levelString="Expert";  
	    int level;  
	    switch(levelString)
	    {    
	       case "Beginner": 
	    	   level=3;  
	           break;    
	       case "Intermediate": 
	    	   level=2;  
	           break;    
	       case "Expert": 
	    	   level=1;  
	           break;    
	       default: 
	    	   level=0;  
	           break;  
	    }    
	    System.out.println("Your Level is: "+level);  
	}
}