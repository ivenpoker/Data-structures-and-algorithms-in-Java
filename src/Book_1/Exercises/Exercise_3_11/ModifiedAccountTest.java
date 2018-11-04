package Book_1.Exercises.Exercise_3_11;

import java.util.Scanner;

public class ModifiedAccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ModifiedAccount account1 = new ModifiedAccount("James Bond", 1000000);
        ModifiedAccount account2 = new ModifiedAccount("Clark Kent", 2000000);

        System.out.printf("Account1 for '%s': $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("Account2 for '%s': $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter account1 withdraw amount: ");
        double withDrawAmount = input.nextDouble();

        double amount = account1.withDraw(withDrawAmount);
        if (amount == withDrawAmount) {
            System.out.printf("%s's account [balance: %.2f] [removed: %.2f]%n%n",
                    account1.getName() ,account1.getBalance(), amount);
        }

        System.out.print("Enter account2 withdraw amount: ");
        withDrawAmount = input.nextDouble();

        amount = account2.withDraw(withDrawAmount);
        if (amount == withDrawAmount) {
            System.out.printf("%s's account [balance: $%.2f] [removed: $%.2f]%n%n",
                    account2.getName() ,account2.getBalance(), amount);
        }
    }
}
