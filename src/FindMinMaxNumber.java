import java.util.Scanner;

public class FindMinMaxNumber {

    public static void main(String[] args)  // main method created


    {


        Scanner scanner = new Scanner(System.in); // scanner object created
        System.out.println("Enter number one:");
        int numberOne = scanner.nextInt(); // variable numberone which takes input in integer value
        System.out.println("Enter number two:");
        int numberTwo = scanner.nextInt(); // variable numbertwo which takes input in integer value
        System.out.println("Enter number three:");
        int numberThree = scanner.nextInt(); // variable numberthree which takes input in integer value

        int min, max;  // min and max variable with default value initiated

        // if else condition for finding max value out of three input which will be assigned to min variable
        if (numberOne >= numberTwo && numberOne >= numberThree)

        {

            max = numberOne;
            
        } else if (numberTwo >= numberOne && numberTwo >=numberThree) {
            max = numberTwo;
        } else {
            max = numberThree;
        }


        // if else condition for finding min value out of three value which will be assigned to min variable
        if (numberOne <= numberTwo && numberOne <= numberThree) {

            min = numberOne;

        } else if (numberTwo <= numberOne && numberTwo <=numberThree) {
            min = numberTwo;
        } else {
            min = numberThree;
        }

        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);

    }
}


