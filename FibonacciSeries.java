package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series for "+maxNumber+" numbers:");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	      
	            int add = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = add;
	        }

	}

}