package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample
{
    public static void main(String[] args) 
		{
			//Create an object of ArrayList
			ArrayList a=new ArrayList();
			
			//Insert element in ArrayList
			a.add(200);//index=0
			a.add("Hello");//index=1
			a.add(7.5);//index=2
			a.add(null);//3
			a.add(200);//4
			
			System.out.println(a);
			//want to add element in index 2
			a.add(2,"Priya");
			System.out.println(a);
			
			ArrayList al=new ArrayList();
			al.add(40);
			al.add(5.6);
			al.add("Neha");
			
			a.addAll(al);
			System.out.println(a);
			a.addAll(4, al);//200 Hello Priya 7.5 40 5.6 neha
			System.out.println(a);
			
			//Delete element
			a.remove(7.5);
			System.out.println(a);
			
			//replace value of element
			a.set(3, 400);
			System.out.println(a);
			
			System.out.println(a.size());
			
			//Fetch element of arraylist using forloop
			for(int i=0;i<=a.size()-1;i++)
			{
				System.out.println(a.get(i));
			}
			System.out.println("-------------------------------------------");
			//using foreachloop
			for(Object o:a)
			{
				System.out.println(o);
			}
			
			//using iterator cursor
			
			Iterator s=a.iterator();
			while(s.hasNext())
			{
				System.out.println(s.next());
			}
			
			//using ListIterator cursor
			System.out.println("-------------------------------------------");
			ListIterator l=a.listIterator();
			while(l.hasNext())
			{
				System.out.println(l.next());
			}
			while(l.hasPrevious())
			{
				System.out.println(l.previous());
			}
			
			//check particular element is present in list or not=search
			boolean result=a.contains(5.6);
			System.out.println(result);
			
			//Create Arraylist of generic type=Homogeneous
			
			ArrayList <Integer> al1= new <Integer>ArrayList();
			al1.add(200);
			al1.add(300);	

		}

	


}
