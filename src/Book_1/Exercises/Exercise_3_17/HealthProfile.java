package Book_1.Exercises.Exercise_3_17;

import java.time.Year;

public class HealthProfile {

    public String _firstName;
    public String _lasttName;
    public String _gender;
    public int _month;
    public int _day;
    public int _year;
    public int _height;
    public int _weight;

    public HealthProfile(String userFirstName, String userLastName, String userGender,
                         int userMonth, int userDay, int userYear, int userHeight, int userWeight) {
        this._firstName = userFirstName;
        this._lasttName = userLastName;
        this._gender    = userGender;
        this._month     = userMonth;
        this._day       = userDay;
        this._year      = userYear;
        this._height    = userHeight;
        this._weight    = userWeight;
    }

    public void setFirstName(String newFirstName) {
        this._firstName = newFirstName;
    }

    public String getFirstName() {
        return this._firstName;
    }

    public void setLastName(String newLastName) {
        this._lasttName = newLastName;
    }

    public String getLastName() {
        return this._lasttName;
    }

    public void setGender(String newGender) {
        this._gender = newGender;
    }

    public String getGender() {
        return this._gender;
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

    public void setHeight(int newHeight) {
        this._height = newHeight;
    }

    public int getHeight() {
        return this._height;
    }

    public void setWeight(int newWeight) {
        this._weight = newWeight;
    }

    public int getWeight() {
        return this._weight;
    }

    public int getAge() {
        return Year.now().getValue() - this.getYear();
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

    public double getBMI() {
        return (double) (this.getWeight() * 703) / (this.getHeight() * this.getHeight());
    }
}
