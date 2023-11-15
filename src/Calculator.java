import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        var x = new Scanner(System.in).nextInt();
        System.out.print("Enter y: ");
        var y = new Scanner(System.in).nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}
