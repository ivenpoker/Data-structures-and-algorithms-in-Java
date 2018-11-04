package Book_1.Exercises.Exercise_3_16;

import java.time.Year;

public class HeartRates {

    private String _firstName;
    private String _lastName;
    private int _month;
    private int _day;
    private int _year;

    public HeartRates(String newFirstName, String newLastName,
                      int newBirthMonth, int newBirthDay, int newBirthYear) {
        this._firstName = newFirstName;
        this._lastName  = newLastName;
        this._month     = newBirthMonth;
        this._day       = newBirthDay;
        this._year      = newBirthYear;
    }

    public void setFirstName(String newFirstName) {
        this._firstName = newFirstName;
    }

    public String getFirstName() {
        return this._firstName;
    }

    public void setLastName(String newLastName) {
        this._lastName = newLastName;
    }

    public String getLastName() {
        return this._lastName;
    }

    public void setMonth(int newMonth) {
        this._month = newMonth;
    }

    public int getMonth() {
        return this._month;
    }

    public void setDay(int newDay) {
        this._day = newDay;
    }

    public int getDay() {
        return this._day;
    }

    public void setYear(int newYear) {
        this._year = newYear;
    }

    public int getYear() {
        return this._year;
    }

    public int getAge() {
       return Year.now().getValue() - this._year;  // computes age of a user.
    }

    public int maximumHeartRate() {
        return 220 - this.getAge();
    }

    public double targetHeartRate(int range50and85) {
        if (range50and85 < 50 || range50and85 > 85) {
            return (70.0 / 100.0) * this.maximumHeartRate();
        }
        return ((double)range50and85 / 100) * this.maximumHeartRate();
    }
}
