package week1.day1.assignments;

public class Factorial {

	public static void main(String args[]) {
		int factorial = 1;
		int factorialTill = 10;
		for (int i = 1; i <= factorialTill; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + factorialTill + " is :" + factorial);
	}
}