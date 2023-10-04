import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) // main method

    {

        Scanner scanner =  new Scanner(System.in); // scanner object created
        System.out.println("Enter any number: ");
        int number = scanner.nextInt(); // number variable which takes integer value only
        int reverse = 0; // reverse variable with value of zero initiated

        for (;number !=0; number = number/10) // for loop which finds the reverse value of the given number

        {
            int remainder = number%10;
            reverse = reverse * 10 + remainder;

        }
        System.out.println("The reverse of the given number is " + reverse);
    }

}

