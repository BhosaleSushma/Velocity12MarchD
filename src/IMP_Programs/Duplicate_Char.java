package IMP_Programs;

public class Duplicate_Char
{
	public static void main(String[] args) 
	{

		String str="aahhjjeghaaaknaajj";
		
		char[] c=str.toCharArray();
		
		//c={'a',a,h,h,j,j,e,g,h,a,a,a,k,n,a,a,j,j}

		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[i]);
					break;
				}
			}
		}	

		
	}
	

}
