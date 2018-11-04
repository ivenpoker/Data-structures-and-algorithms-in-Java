package Book_1.Exercises.Exercise_3_14;

import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Date date1 = new Date(12, 2, 2009);
        Date date2 = new Date(11, 23, 2016);

        // Displaying information for dates....

        System.out.printf("Date1 (mm/dd/yyyy): %d/%d/%d%n", date1.getMonth(),
                date1.getDay(), date1.getYear());
        System.out.printf("Date2 (mm/dd/yyyy): %d/%d/%d%n%n", date2.getMonth(),
                date2.getDay(), date2.getYear());

        // Testing the 'set' methods

        Scanner input = new Scanner(System.in);
        System.out.print("Enter date for date1 (mm dd yyyy): ");

        int newMonth = input.nextInt();
        int newDay   = input.nextInt();
        int newYear  = input.nextInt();

        date1.setMonth(newMonth);
        date1.setDay(newDay);
        date1.setYear(newYear);

        System.out.print("Enter date for date2 (mm dd yyyy): ");
        newMonth = input.nextInt();
        newDay   = input.nextInt();
        newYear  = input.nextInt();

        date2.setMonth(newMonth);
        date2.setDay(newDay);
        date2.setYear(newYear);

        System.out.println();

        // Displaying information for dates....

        System.out.printf("Date1 (mm/dd/yyyy): %d/%d/%d%n", date1.getMonth(),
                date1.getDay(), date1.getYear());
        System.out.printf("Date2 (mm/dd/yyyy): %d/%d/%d%n", date2.getMonth(),
                date2.getDay(), date2.getYear());


    }
}
