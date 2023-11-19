import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        var x = new Scanner(System.in).nextInt();
        System.out.print("Enter y: ");
        var y = new Scanner(System.in).nextInt();
        System.out.print("Enter operator(+, -, *, /, %): ");
        var operator = new Scanner(System.in).nextLine().charAt(0);
    }
}
