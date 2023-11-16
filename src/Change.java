import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        var x = new Scanner(System.in).nextInt();
        System.out.print("Enter y: ");
        var y = new Scanner(System.in).nextInt();
        int a = x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = y;
        y = a;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
