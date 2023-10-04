import java.util.Scanner;

public class NumberDividedByNine {


    public static void main(String[] args) // main method

    {

        Scanner scanner = new Scanner(System.in); // scanner object
        System.out.println("Enter Starting Number: ");
        int startingNumber = scanner.nextInt(); // starting number variable which accepts integer value only
        System.out.println("Enter Ending Number: ");
        int endingNumber = scanner.nextInt();// ending number variable which accepts integer value only
        int sum = 0; // sum variable with value of zero initiated

        for (int i = startingNumber; i <= endingNumber ; i++) // for loop for finding sum of number between start and ending number


        {

            sum = sum + i;
        }
        if (sum%9 == 0)  // if else condition to check if sum is divided by 9 or not

        {
            System.out.println("Sum of number " + startingNumber + " to " + endingNumber + " is divided by 9");
        } else {
            System.out.println("Sum of number " + startingNumber + " to " + endingNumber + " is NOT divided by 9");

        }


    }
}
