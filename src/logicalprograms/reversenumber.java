package logicalprograms;

public class reversenumber {
	public static void main(String[] args) {
		

{
	int original= 12345;
	
	String originalvalue= Integer.toString(original);
	String revers= "";
	
	for (int i=originalvalue.length()-1; i>0; i--)
	{
		revers= revers+originalvalue.charAt(i);
	}
	
	int reversnum=Integer.parseInt(revers);
	System.out.println(reversnum);
	
	
}
}
}