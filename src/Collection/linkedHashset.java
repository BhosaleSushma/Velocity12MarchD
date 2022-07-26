package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashset
{
		public static void main(String[] args) 
		{
			//create linkedHashSet of heterogeneous
			LinkedHashSet lhs= new LinkedHashSet();
			
			//Adding elements
			lhs.add("Black");
			lhs.add(1);
			lhs.add(5.6f);
			lhs.add('A');
			lhs.add(1);//ignore
			lhs.add(null);
			lhs.add(null);//ignore
			
			System.out.println(lhs);
			System.out.println(lhs.size());
			
			lhs.add("Red");
			
			Iterator i= lhs.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			//Removing elements 
			lhs.remove(null);
			System.out.println(lhs);
			
			System.out.println(lhs.isEmpty());
			System.out.println(lhs.contains(10));
		}
	


}
