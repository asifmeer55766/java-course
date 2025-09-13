
import java.util.*;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfTry = 5;
        int rewards = 50;
        int randomNumber = 1 + (int) (10 * Math.random());
        int[] values = new int[numberOfTry];

        System.out.println("Guess any number between 1-10 ");

        for (int i = 0; i < numberOfTry; i++) {
            values[i] = sc.nextInt();

            if (values[i] < randomNumber) {
                System.out.println("Number is greater ");
                rewards -= 10;
            } else if (values[i] > randomNumber) {
                System.out.println("Number is less ");
                rewards -= 10;

            } else if (values[i] == randomNumber) {
                System.out.println("Correct Guess: " + randomNumber);
                System.out.println("Your Score " + rewards);
            }
        }

        System.out.println("You Lose , Number was " + randomNumber);
        System.out.println("Your Score " + rewards);

    }
}
