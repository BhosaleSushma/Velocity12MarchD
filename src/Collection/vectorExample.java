package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorExample 
{
	

		public static void main(String[] args) 
		{
			Vector v= new Vector();
			v.add("India");
			v.add(123);
			v.add("USA");
			v.add(3.14);
			v.add("India");
			v.add(null);
			v.add(null);
			
			System.out.println(v);
			System.out.println(v.get(3));
			System.out.println(v.isEmpty());
			
			v.set(2, "Shrilanka");
			System.out.println(v);
			
			v.remove(null);
			v.remove(null);
			System.out.println(v);
			
			System.out.println(v.indexOf("India"));
			System.out.println(v.lastIndexOf("India"));
			
			//print element using enumeration cursor
			Enumeration e= v.elements();
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
			//print element using iterator cursor
			Iterator i=v.iterator();
			while(i.hasNext())
			{
				System.out.print(i.next()+" ");
			}
			System.out.println();
			//print element using listiterator cursor
			ListIterator l=v.listIterator();
			while(l.hasNext())
			{
				System.out.print(l.next()+" ");
			}
			
			v.clear();
			System.out.println(v);
		}
	


}
