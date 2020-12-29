package logicalprograms;

public class pallimdrom {
	
	public static void palindromnumbers(int num){
		System.out.println("given number is :"+ num);
		
		int sum=0;
		int r=0;
		int t;
		t=num;
		
		while (num>0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		
		if (t==sum)
		{
			System.out.println("pallindromenumber");
		}
		else {
			System.out.println("not pallindrome number ");
		}
		
		
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
palindromnumbers(151);
palindromnumbers(152);
	}

}
