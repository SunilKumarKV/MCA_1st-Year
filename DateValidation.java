import java.util.Scanner;
public class DateValidation{
    // class body goes here..
    private static boolean isLeap(int year) {
        // Leap year if divisible by 4 and (not divisible by 100 or divisible by 400)
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
    private static boolean isValid(int date, int month, int year) {
        if(year < 1 || year > 9999) return false;
        if(month < 1 || month > 12) return false;
        if(date < 1 || date > 31) return false;
        switch(month) {
            case 4, 6, 9, 11 : return date <= 30;
            case 2: return isLeap(year) ? date <= 29 : date <= 28;
            default: return date <= 31;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Date: ");
        int date = sc.nextInt();

        System.out.println("Enter a Month: ");
        int month = sc.nextInt();

        System.out.println("Enter a Year: ");
        int year = sc.nextInt();

        System.out.println("-------------------");

        System.out.println("Enter Date: "+ date +"/"+ month +"/"+ year);

        if(isValid( date, month, year)){
            System.out.println("Result: VALID DATE");
        } else {
            System.out.println("Result: INVALID DATE");
        }
        sc.close();   // closes underlying System.in
    }
}