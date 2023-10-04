import java.util.Scanner;

public class FactorialProgram {


    public static void main(String[] args)  //Main method

    {

        int i; // integer i variable with default value
        int fact = 1; // fact variable with one as intitial value
        Scanner scanner = new Scanner(System.in); // scanner object created
        System.out.println("Enter any number: ");
        int number = scanner.nextInt(); // number variable

        for (i = 1; i <= number ; i++)  // For loop for finding factorial of the given number

        {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is " + fact);

    }
}
