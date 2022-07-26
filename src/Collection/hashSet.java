package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet
{
	

		public static void main(String[] args) 
		{
			HashSet h= new HashSet();
			h.add("xyz");
			h.add(300);
			h.add(7.5);
			h.add('g');
			h.add(7.5);//ignore
			h.add(null);
			h.add(null);//ignore
			
			System.out.println(h);
			
			h.remove('g');
			System.out.println(h);
			
			Iterator i=h.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			for(Object o:h)
			{
				System.out.println(o);
			}	
		
	}


}
