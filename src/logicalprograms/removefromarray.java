package logicalprograms;

public class removefromarray {

	public static void main(String[] args) {
		
		// we remove junk from array by using regullar expression 
		
		String s= "abc 222 @@@ &&&&";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		
		
		
		
		
		
		

	}

}
