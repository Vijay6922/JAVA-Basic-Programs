package collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
class Example
{
	public static void main(String args[])
	{
		HashSet<String> number = new HashSet<>();   //gives unique values....
		number.add("0");
		number.add("38");
		number.add("267");
		number.add("187");
		number.add("167");
		number.add("276");
		number.add("abs");
		List<Integer> n = new ArrayList<>();
		for(String a : number)
		{
			try
			{
			n.add(Integer.parseInt(a));
			}
			catch(Exception e)
			{
				
			}
		}
		Collections.sort(n);
		List<String> q = new ArrayList<>();
		for(Integer i : n)
		{
			q.add(Integer.toString(i));
		}
		HashSet<String> h = new HashSet<>(q);
		for(String g : h)
		System.out.println(g);
		
//		System.out.println(number);
//		//Collections.sort(number);
//		
//		Collections.sort(n);
//		System.out.println(n);
		String department = null;
		String name = null;
		HashMap<String,String> map = new HashMap<>();
		
		map.put("it", "vijay");
		map.put("hr","kumar");
		map.put("hr","vijay1");
		map.put("it","kumar1");
		HashMap<String,String> map2 = new HashMap<>(map);
		for(HashMap.Entry<String,String> e : map2.entrySet())
		{
			 department = e.getKey();
			 name = e.getValue();
		}
		if(map2.containsKey(department))
		{
			map2.put(department,map2.get(department)+ "," + name);
		}
		System.out.println(map);
		
		
		
	}
}
