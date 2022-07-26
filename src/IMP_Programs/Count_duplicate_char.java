package IMP_Programs;

import java.util.HashMap;
import java.util.Set;



public class Count_duplicate_char 
{
	public static void main(String[] args) 
	{

		String str="aahhjjeghaaaknaajj";
		
		char[] c=str.toCharArray();
		
		HashMap<Character, Integer> hmap= new HashMap<Character, Integer>();
		
		for(char s:c)
			if(hmap.containsKey(s))
				hmap.put(s, hmap.get(s)+1);
			else
				hmap.put(s, 1);

		//(a,1)(a,2)(h,1)(h,2)
		
		Set<Character> key=hmap.keySet();
		for(char ch:key)
			if(hmap.get(ch)>1)
				System.out.println(ch+" "+hmap.get(ch));
		

		
	}

}
