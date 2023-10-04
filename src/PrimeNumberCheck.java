public class PrimeNumberCheck {




    public static void main(String[] args) // main method

    {

        int num = 28; // variable number with value of 28
        boolean flag = false; // variable flag with boolean datatype and value of false initiated
        for (int i = 2; i <= num/2 ; i++) // condition for non prime number
        {
            if (num % i == 0) {
                flag = true;
                break; // to end the loop if condition is true
            }
        }

        if (!flag) // if else condition for finding prime number or not

        {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

}
