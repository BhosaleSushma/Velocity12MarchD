package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListExample 
{
	
		public static void main(String[] args) 
		{
			LinkedList l= new LinkedList();
			l.add(100);
			l.add("USA");
			l.add(8.9);
			l.add("USA");
			l.add(null);
			l.add(200);
			
			System.out.println(l);
			
			l.add(1, "India");
			System.out.println(l);
			
			//iterator cursor
			Iterator i= l.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			l.remove(4);
			
			//listiterator cursor
			ListIterator li=l.listIterator();
			while(li.hasNext())
			{
				System.out.print(li.next()+" ");
			}
			LinkedList ll=new LinkedList();
			ll.add(300);
			ll.add("Tina");
			
			l.addAll(2,ll);
		
			System.out.println(l);
		}
	


}
