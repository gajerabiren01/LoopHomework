import java.util.Scanner;

public class PrintAnyNumberRange {

    public static void main(String[] args)  // main method

    {


        Scanner scanner = new Scanner(System.in); // scanner object created
        System.out.println("Enter Starting number A: ");
        int a = scanner.nextInt(); // a variable which accepts only integer value
        System.out.println("Enter Ending number B: ");
        int b = scanner.nextInt();// b variable which accepts only integer value
        for (int i = a; i <b ; i++) // for loop for finding range between number a and b

        {

            System.out.println(i);

        }

    }


}
