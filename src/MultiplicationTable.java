import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) // main method

    {


        Scanner scanner = new Scanner(System.in); // scanner object created
        System.out.println("Enter any number: ");
        int number = scanner.nextInt(); // number variable which accepts only integer value

        for (int i = 1; i <= 10; i++) // for loop for creating multiplication table

        {

            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
