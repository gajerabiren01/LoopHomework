public class NumberDividedByThreeAndFive {


    public static void main(String[] args) // main method


    {

        for (int i = 0; i <=100 ; i++) // number between zero and 100 with for loop

        {

            if (i%3 == 0 && i%5 == 0)  //if condition to check in number is divisible by 3 and 5

            {

                System.out.println(i);
            }
        }

    }

}
