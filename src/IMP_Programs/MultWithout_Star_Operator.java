package IMP_Programs;

public class MultWithout_Star_Operator
{
	public static void main(String[] args) 
	{
		//num1 * num2
				//  3   5=   15  
				//  3+3+3+3+3= 15
				//  5+5+5= 15
				
				int a=10;
				int b=5;
				int mult=0;
				
				//10+10+10+10+10
				
				for(int i=1;i<=b;i++)
				{
					mult=mult+a;//0+10=10 10+10=20 20+10=30 30+10=40 40+10=50 
				}
				System.out.println(mult);//50

		
	}

}
