import java.util.Scanner;

public class averageClass {
    public static void main(String[] args){
        /* QUESTION - A program is needed to prompt the user operator for
        ten exam scores, calculate the average score and display the
        result to the screen. The average score is calculated as
        the sum of the scores divided by the number of scores.
        */

        /* PSEUDO-CODE -
        INPUT - prompt user for ten exam scores
        OUTPUT - average of the ten exam scores
        PROCESS - add all the input that you get from  the user in a variable,
        repeat the process ten times. finally print the output.
        */

        /*
        -there is a need for repetition control structure
        -variables required are, x (to receive integer from user)
        i(increment ten times), sum, average
         */

        Scanner keybrd = new Scanner(System.in);
        float ave, sum = 0;
        int x , y;

        System.out.println("Enter the first score please:"); //first score
        x = keybrd.nextInt(); // first score read from user

        for (int i = 0; i < 9; i++) {
            System.out.println("Enter next score please:");
            y = keybrd.nextInt();
            sum = sum + y;
        }
        sum = sum+x;

        ave = sum/10;

        System.out.println("The sum of the scores that you entered is "+ sum);
        System.out.println("The average of the scores that you entered is "+ ave);
    }
}
