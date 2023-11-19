import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        var x = new Scanner(System.in).nextInt();
        System.out.print("Enter y: ");
        var y = new Scanner(System.in).nextInt();
        System.out.print("Enter operator(+, -, *, /, %): ");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        String result;
        if (operator == '+') {
            result = "x + y = " + (x + y);
        } else if (operator == '-') {
            result = "x - y = " + (x - y);
        } else if (operator == '*') {
            result = "x * y = " + (x * y);
        } else if (operator == '/') {
            result = "x / y = " + (x / y);
        } else if (operator == '%') {
            result = "x % y = " + (x % y);
        } else {
            result = "Enter correct data " + operator;
        }

        System.out.println(result);
    }
}
