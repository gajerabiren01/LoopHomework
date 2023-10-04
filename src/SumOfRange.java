import java.util.Scanner;

public class SumOfRange {


    public static void main(String[] args) // main method

    {

        Scanner scanner =  new Scanner(System.in); // scanner object created
        System.out.println("Enter starting number : ");
        int StartingNumber = scanner.nextInt(); // variable starting number which accepts only integer
        System.out.println("Enter ending number: ");
        int EndingNumber = scanner.nextInt(); // variable ending number which accepts only integer
        int sum = 0; // variable sum with value of zero initiated

        for (int i = StartingNumber; i <= EndingNumber; i++) // for loop for making sum of given range

        {

            sum = sum + i;
        }
        System.out.println("The sum of number "+ StartingNumber+ " to " + EndingNumber+" is " + sum);



    }
}
