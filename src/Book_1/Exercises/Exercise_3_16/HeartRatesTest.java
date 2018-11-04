package Book_1.Exercises.Exercise_3_16;

import java.util.Scanner;

public class HeartRatesTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.printf("%n---------- COLLECTING USER INFORMATION --------------%n%n");

        // Getting the user's information....

        System.out.print("Enter your first name: ");
        String userFirstName = input.next();

        System.out.print("Enter your last name : ");
        String userLastName  = input.next();

        System.out.print("Enter your birth date (mm dd yyyy): ");
        int userMonth = input.nextInt();
        int userDay   = input.nextInt();
        int userYear  = input.nextInt();

        HeartRates userHeartRate = new HeartRates(userFirstName, userLastName,
                userMonth, userDay, userYear);

        System.out.printf("%n---------- USER INFORMATION --------------%n%n");
        System.out.printf("User first name: %s%n", userHeartRate.getFirstName());
        System.out.printf("User last  name: %s%n", userHeartRate.getLastName());
        System.out.printf("User birth date: %d/%d/%d%n", userHeartRate.getMonth(),
                userHeartRate.getDay(), userHeartRate.getYear());
        System.out.printf("User current age: %d%n", userHeartRate.getAge());
        System.out.printf("Users maximum heart rate: %d%n", userHeartRate.maximumHeartRate());
        System.out.printf("Users target heart rate: %.2f%n", userHeartRate.targetHeartRate(55));
    }
}
