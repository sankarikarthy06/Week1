package week1.assignment;

public class Factorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int numberGiven = 5;
		int factorNo = 1;
		
		for (int i = 1; i <= numberGiven; i++)
		{
			factorNo = factorNo * i;
			
			
			
		}
		
		System.out.println("Factorial of a Number " + numberGiven+ " is " +factorNo);
		
	}

}
