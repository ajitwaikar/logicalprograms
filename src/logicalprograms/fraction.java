package logicalprograms;

import java.util.Scanner;

public class fraction {
	public static void main(String[] args) {
		int number;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		number=scan.nextInt();
		int fact=2;
		for (int i=number;i<=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("fraction is"+ fact);
	}

}
