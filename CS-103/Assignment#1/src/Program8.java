public class Program8 
{
	public static void main(String[] args) 
	{
		int var1=10;  
		System.out.println("Postfix(++): "+ var1++);//10 (11)  
		System.out.println("Prefix(++): "+ ++var1);//12  
		System.out.println("Postfix(--): "+ var1--);//12 (11)  
		System.out.println("Prefix(--): "+ --var1);//10  
	}
}