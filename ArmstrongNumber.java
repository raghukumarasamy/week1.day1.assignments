package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {

        int num = 379, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is NOT an Armstrong number");
    }
}