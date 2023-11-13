import java.util.Scanner;

public class FromConsole {
    public static void main(String[] args) {
        var x = new Scanner(System.in).nextInt();
        var y = new Scanner(System.in).nextInt();
        System.out.println(x * y);
    }
}
