package Book_1.Exercises.Exercise_3_15;

public class Account {

    private String _name;
    private double _balance;

    public Account(String newName, double newBalance) {
        this._name = newName;
        if (newBalance > 0.0)
            this._balance = newBalance;
    }

    public void deposite(double depositeAmount) {
        if (depositeAmount > 0.0)
            this._balance = this._balance + depositeAmount;
    }

    public double getBalance() {
        return this._balance;
    }

    public void setName(String newName) {
        this._name = newName;
    }

    public String getName() {
        return this._name;
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
