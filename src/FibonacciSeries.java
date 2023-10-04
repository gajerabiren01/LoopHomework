import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args)  // main method

    {

        Scanner scanner = new Scanner(System.in); // scanner object
    int n1 = 0; // variable with initial value of zero
    int n2 = 1; //variable n2 with initial value of one
    int n3; // variable n3 with default value
        System.out.println("Enter the Count number: ");
    int count = scanner.nextInt(); // count variable which accept integer only

        System.out.print(n1 + " " + n2); // For printing 0 and 1

        for (int i = 0; i < count ; i++)  // Loop starts from 2 because 0 and 1 already printed
        {

            n3 = n1 + n2;

            System.out.print( " " +n3);

            n1 = n2; //value of n1 is replaced by n2 for next iteration
            n2 = n3; // value of n2 is replaced by n3 for next iteration


        }



    }

}
