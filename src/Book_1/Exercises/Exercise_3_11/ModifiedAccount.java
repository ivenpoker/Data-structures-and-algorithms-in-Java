package Book_1.Exercises.Exercise_3_11;

public class ModifiedAccount {
    private String _name;
    private double _balance;

    public ModifiedAccount(String newName, double newBalance) {
        this._name = newName;
        if (newBalance > 0.0)
            this._balance = newBalance;
    }

    public void deposit(double depositeAmount) {
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

    public double withDraw(double withDrawAmount) {
        if (withDrawAmount > this._balance) {
            System.out.printf("Withdrawal amount exceeded account balance%n%n");
            return 0.0;     // this is just a dummy value fot invalid withdrawal
        }
        this._balance = this._balance - withDrawAmount;
        return withDrawAmount;
    }

}
