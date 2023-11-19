import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.print("Enter the day of the week number: ");
        var day = new Scanner(System.in).nextInt();

        String result;
        if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else if (day == 7) {
            result = "Sunday";
        } else {
            result = "Enter the correct day of the week number";
        }

        System.out.println(result);
    }
}
