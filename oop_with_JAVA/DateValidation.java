package oop_with_JAVA;
import java.util.Scanner;

/**
 * The DateValidation class checks if a given date (day, month, year) is valid.
 * It includes logic for leap years and correct days per month.
 */
public class DateValidation{
    /**
     * Helper method to determine if a given year is a leap year.
     * A year is a leap year if it is divisible by 4,
     * unless it is divisible by 100 but not by 400.
     *
     * @param year The year to check.
     * @return true if the year is a leap year, false otherwise.
     */
    private static boolean isLeap(int year) {
        // Leap year if divisible by 4 and (not divisible by 100 or divisible by 400)
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    /**
     * Validates a full date (date, month, year) based on standard calendar rules.
     * It checks basic ranges and then handles month-specific day limits, including leap years.
     *
     * @param date The day of the month (1-31).
     * @param month The month of the year (1-12).
     * @param year The year (e.g., 1 to 9999).
     * @return true if the date is valid, false otherwise.
     */
    private static boolean isValid(int date, int month, int year) {
        // Basic range checks for year, month, and day
        if(year < 1 || year > 9999) return false;
        if(month < 1 || month > 12) return false;
        if(date < 1 || date > 31) return false;
        switch(month) {
            case 4, 6, 9, 11 : return date <= 30;  // April, June, September, November have 30 days
            case 2:  // February has special logic due to leap years
                // If it's a leap year, max days is 29, otherwise 28
            return isLeap(year) ? date <= 29 : date <= 28;
            default: return date <= 31;  // All other months (1, 3, 5, 7, 8, 10, 12) have 31 days
        }
    }

    /**
     * The main entry point of the program.
     * Prompts the user to enter a date, month, and year,
     * validates the input using the isValid method, and prints the result.
     *
     * @param args Command line arguments (unused).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console (System.in)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Date: ");
        int date = sc.nextInt();  // Read the day integer

        System.out.println("Enter a Month: ");
        int month = sc.nextInt();

        System.out.println("Enter a Year: ");
        int year = sc.nextInt();

        System.out.println("-------------------");

        // Display the entered date in standard format for confirmation
        System.out.println("Enter Date: "+ date +"/"+ month +"/"+ year);

        // Call the validation method and print the result
        if(isValid( date, month, year)){
            System.out.println("Result: VALID DATE");
        } else {
            System.out.println("Result: INVALID DATE");
        }
        sc.close();   // It's good practice to close the scanner when done
    }
}