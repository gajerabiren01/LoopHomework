import java.util.Scanner;

public class SumOfNaturalNumber {


    public static void main(String[] args)  // main method

    {

        Scanner scanner = new Scanner(System.in); // scanner object created
        int i; // variable i with default value initiated
        System.out.println("Enter any positive number: " );
        int number = scanner.nextInt(); // variable number which accepts only integer value
        int sum = 0; // variable sum initiated with the value of zero

        for ( i = 1; i <= number ; i++) // for loop for making sum of natural number

        {

            sum =  sum + i;
        }

        System.out.println("Sum of First "+ number + " natural Number is = " + sum);

    }
}
