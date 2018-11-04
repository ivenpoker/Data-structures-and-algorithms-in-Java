package Book_1.Exercises.Exercise_3_17;

import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%n---------- COLLECTING USER INFORMATION --------------%n%n");

        // Getting the user's information ....

        System.out.print("Enter your first name: ");
        String userFirstName = input.next();

        System.out.print("Enter your last name: ");
        String userLastName  = input.next();

        System.out.print("Enter your gender (M/F or Male/Female): ");
        String userGender = input.next();

        System.out.print("Enter your birth date as (mm dd yyyy): ");
        int userMonth = input.nextInt();
        int userDay   = input.nextInt();
        int userYear  = input.nextInt();

        System.out.print("Enter your height (in inches): ");
        int userHeight = input.nextInt();

        System.out.print("Enter your weight (in pounds): ");
        int userWeight = input.nextInt();

        HealthProfile userHealthProfile = new HealthProfile(userFirstName, userLastName,
                userGender, userMonth, userDay, userYear, userHeight, userWeight);

        System.out.printf("%n---------- USER INFORMATION --------------%n%n");

        System.out.printf("User first name: %s%n", userHealthProfile.getFirstName());
        System.out.printf("User last name : %s%n", userHealthProfile.getLastName());
        System.out.printf("User gender:     %s%n", userHealthProfile.getGender());
        System.out.printf("User birth date: %d/%d/%d%n", userHealthProfile.getMonth(),
                userHealthProfile.getDay(), userHealthProfile.getYear());
        System.out.printf("User height:     %d%n", userHealthProfile.getHeight());
        System.out.printf("User weight:     %d%n", userHealthProfile.getWeight());
        System.out.printf("User age:        %d%n", userHealthProfile.getAge());
        System.out.printf("User maximum heart rate: %d%n", userHealthProfile.maximumHeartRate());

        System.out.println();
        System.out.printf(" ------- BMI VALUES --------%n");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
        System.out.printf(" ----------------------------%n");
        System.out.println();

        System.out.printf("User BMI value:  %.2f%n", userHealthProfile.getBMI());
        System.out.printf("User target heart range: %.2f%n", userHealthProfile.targetHeartRate(68));
    }
}
