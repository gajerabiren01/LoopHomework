import java.util.Scanner;

public class CountCharacterInString {

//Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//scanner object created
        System.out.println("Write any sentence: ");

        String sentence = scanner.next(); //sentence variable initiated

       sentence=  sentence.toLowerCase();//applied lowercase method on sentence variable
        char character = 'a'; //character variable initiated with value of a

        int count = 0; // initial value of count variable is zero

        for (int i = 0; i < sentence.length(); i++) //for loop for finding character a in a sentence
        {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }

        System.out.println("Occurrences of " + character + " are " + count);



    }

}
