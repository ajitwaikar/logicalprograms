package logicalprograms;

public class primenumber {
	
	public static boolean isprimenum(int num)
	{	
		
		//corner condition 
		
		
		if (num<=1)
		{
		return false ;	
		}
		
		for ( int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				return false;
			}
			
			
			
			
		}
		
		return true;
		
		
	
		
	}
	
	public static void getprime(int num)
	{
		System.out.println("prime number up to 20 is following:");
		for (int i=2; i<=num; i++)
			
			
		{
			if(isprimenum(i))
				
				System.out.println(i+" ");
		}
			
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println(" given number is prime  :"+isprimenum(45));
		
		
		getprime(20); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
