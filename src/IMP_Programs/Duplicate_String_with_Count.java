package IMP_Programs;

import java.util.HashMap;
import java.util.Set;

public class Duplicate_String_with_Count 
{
	public static void main(String[] args) 
	{
        String[] str= {"velocity","priya","priya","velocity","mango","chickoo","dog","cat","dog"};
		
		HashMap<String, Integer> hmap= new HashMap<String, Integer>();
		
		for(String s:str)
			if(hmap.containsKey(s))
				hmap.put(s, hmap.get(s)+1);
			else
				hmap.put(s, 1);
		
		Set<String> key=hmap.keySet();
		for(String ch:key)
			if(hmap.get(ch)>1)
				System.out.println(ch+" "+hmap.get(ch));

		
	}

}
