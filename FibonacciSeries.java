package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNo = 0; 
		int secondNo = 1; 
		int countTemp; 
		System.out.println("FibonacciSeries are ");
		for (int i = 0; i <= 10; i++)
		{
			countTemp = firstNo + secondNo;
			secondNo = firstNo;
			firstNo = countTemp;
			
			
			System.out.println(countTemp);
		}
	}

}
