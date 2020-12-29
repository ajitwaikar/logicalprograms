package logicalprograms;

public class pallindrome {
	
	public static void pallindromnumber( int num)
	{
		
		int rem=0;
		int sum=0;
		int t;
		t=num;
		while (num>0)
		{
			rem=rem%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		
		if(t==sum)
		{
			System.out.println("number is  pallindrome");
		}
		
		
		
		else 
		{
			System.out.println("number is not pallindrome");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		pallindromnumber(100);
		
		pallindromnumber(151);
		
	}	}
