import java.util.Scanner;

public class TriangularPattern {


    public static void main(String[] args) // main method

    {


        Scanner scanner = new Scanner(System.in); // scanner object created
        System.out.println("Enter any number");
        int rows = scanner.nextInt(); // variable rows which accepts only integer

        for (int i = 1; i <=rows; i++)  // outer for loop for counting rows

        {
            for (int j = 1; j <=i ; j++) // inner loop for printing pattern
            {
                System.out.print("*");
            }
            System.out.println(); // for going on the next line
        }


    }

}
