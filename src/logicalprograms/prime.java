package logicalprograms;

public class prime {

	public static boolean prime1(int num){
		if(num <=1)
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
	
	public static void getprime(int num){
		
		for (int i=2; i<=num; i++)
		{
			if (prime1(i))
				System.out.println(i +" ");
		}
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {


		System.out.println( "2 is prime number; "+ prime1(2));
		getprime(7);
		
	}

}
