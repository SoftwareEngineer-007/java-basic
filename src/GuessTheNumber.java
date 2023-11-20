import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Choose a random number
        var number = new Random().nextInt(10);
        // Requesting input from the user
        System.out.print("Try to guess the hidden number (0-9) ");
        var answer = new Scanner(System.in).nextInt();

        String result;
        // Compare the result
        if (answer > number) {
            result = "The hidden number was less - " + number;
        } else if (answer < number) {
            result = "The hidden number was greater - " + number;
        } else {
            result = "You guessed the hidden number!!! It was " + number;
        }
        // Output the result to the console
        System.out.println(result);
    }
}
