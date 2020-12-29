package logicalprograms;

import java.util.Arrays;

public class highestlowest {

	public static void main(String[] args) {
	
		int numbers []= new int  [4];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=500;
		numbers[3]=80;
		
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for (int i=1; i<numbers.length;i++)
		{
			if (numbers[i]> largest)
			{
				largest=numbers[i];
			}
			else if (numbers[i]< smallest)
			{
				smallest= numbers[i];
			}
		}
	
		System.out.println("in given array is:"+ Arrays.toString(numbers));
		System.out.println("largest number is:"+ largest);
		System.out.println("smallest number is "+ smallest);
		

	}

}
