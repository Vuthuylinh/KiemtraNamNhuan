import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibley400 = year % 400 == 0;
                if (isDivisibley400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year",year);
        } else {
            System.out.printf("%d is not a leap year",year);
        }
    }

}
