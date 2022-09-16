public class Program60 
{
	public static void main(String[] args) 
	{
		aa:  for(int i=0;i<=5;i++)
		{    
            bb:  for(int j=0;j<=5;j++)
            {    
                 if(i==2&&j==5)
                 {    continue aa;    }    
                 System.out.println(i+" "+j);    
            }    
         }    
	}
}