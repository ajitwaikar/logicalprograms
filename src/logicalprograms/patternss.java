package logicalprograms;

public class patternss {
	public static void main(String[] args) {
		
	}
	public static void reversenum()
	{
		int originalvalue=12345;
		String original=Integer.toString(originalvalue);
		String reverse=" ";
		for (int i=original.length()-1; i>=0; i--)
		{
			reverse=reverse+original.charAt(i);
		}
int	reversenum=Integer.parseInt(reverse);
System.out.println(reversenum);
	}

}

