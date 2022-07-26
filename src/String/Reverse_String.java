package String;

public class Reverse_String
{
	public static void main(String[] args) 
	
{
	String str="life is beautiful";
	String s1=" ";
	for(int i=str.length()-1;i>=0;i--)
	{
		s1=s1+str.charAt(i);
	}
	System.out.println("Reversed String" +s1 );
}

}
