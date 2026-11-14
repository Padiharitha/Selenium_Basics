package Testcase;

public class Nested_IfElse 
{
	public static void main(String[] args) 
	{
		int Num = 10;
		if(Num >=0)
		{
			if(Num % 2 ==0)
			{
				System.out.println("Positive and Even");
			}
			else
			{
				System.out.println("Positive and Odd");
			}
		}	
		else
		{
			if(Num %2 == 0)
			{
				System.out.println("Negative and Even");
			}
			else
			{
				System.out.println("Negative and Odd");
			}
		}
	}
}
