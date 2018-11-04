package Book_1.Exercises.Exercise_3_13;

public class Employee {

    private String _firstName;
    private String _lastName;
    private double _monthlySalary;

    public Employee(String newFirstName, String newLastName, double newMonthlySalary) {
        this._firstName = newFirstName;
        this._lastName  = newLastName;
        if (newMonthlySalary >= 0) {
            this._monthlySalary = newMonthlySalary;
        }
    }

    public void setFirstName(String newFirstName) {
        this._firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this._lastName = newLastName;
    }

    public void setMonthlySalary(double newMonthlySalary) {
        if (newMonthlySalary >= 0)
            this._monthlySalary = newMonthlySalary;
    }

    public String getFirstName() {
        return this._firstName;
    }

    public String getLastName() {
        return this._lastName;
    }

    public double getMonthlySalary() {
        return this._monthlySalary;
    }

}
