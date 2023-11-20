import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberTO {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

        System.out.print("Try to guess the hidden number (0-9) ");
        var answer = new Scanner(System.in).nextInt();

        System.out.println(number == answer ? "Congratulations! You guessed!" : "You lose!");
        System.out.println("Hidden number - " + number);
    }
}
