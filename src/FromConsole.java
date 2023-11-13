import java.util.Scanner;

public class FromConsole {
    public static void main(String[] args) {
        System.out.print("Input x: ");
        var x = new Scanner(System.in).nextInt();
        System.out.print("Input y: ");
        var y = new Scanner(System.in).nextInt();
        System.out.print("x * y = " );
        System.out.println(x * y);
    }
}
