package Collection;

import java.util.TreeSet;

public class Treeset 
{
		public static void main(String[] args) 
		{
			//create treeset
			
			TreeSet ts= new TreeSet();
			
			//adding elements
			ts.add("India");
			ts.add("Australia");
			ts.add("Bhutan");
			ts.add("Nepal");
			ts.add("Japan");
			ts.add("Bhutan");//ignore
					
			System.out.println(ts);
			
			//Print treeSet in descending order
			System.out.println(ts.descendingSet());
			
			ts.remove("Japan");
			System.out.println(ts);
		}
	


}
