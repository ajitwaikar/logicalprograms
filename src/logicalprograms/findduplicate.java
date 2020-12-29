package logicalprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class findduplicate {

	public static void main(String[] args) {
		// first approach is worst time complexity is=0(n*n)
		
		
		String names []= { "java", "paython","java", "Ruby", "c++"};
		
		
		for (int i=0; i<names.length; i++)
		{
			for (int j=i+1; j<names.length; j++)
				
				
			{
				if (names[i].equals(names[j]))
				{
					System.out.println("duplicate element is ::"+names[i]);
					
				}
			}
		}
		
		
		// second approach is we uses the hashset method because it stores only unique values
		
		
		HashSet<String> store = new HashSet<String>();
		
		for (String name : names)
		{
			if(store.add(name)==false)
			{
				System.out.println("duplicate number is ::"+name);
			}
		}
		
		
// third approach is hashmap and its very iffective and fast approach and uses time complexity =O(2n)
		
		
		
			HashMap<String, Integer> storemap= new HashMap<String , Integer>();
			
			for (String name : names)
			{
				Integer count  =storemap.get(name);
				
				if (count ==null)
				{
					storemap.put(name, 1);
				}
				
				else
				{
					storemap.put(name, ++count );
				}
				
			}
		
		
	           Set <Entry<String, Integer>> entrySet	=storemap.entrySet();
	           
	           for (Entry<String,Integer> entry: entrySet)
	           {
	        	   if (entry.getValue()>1)
	        	   {
	        		   System.out.println("duplicate value is::"+ entry.getKey());
	        	   }
	           }
		
		
	}

}
