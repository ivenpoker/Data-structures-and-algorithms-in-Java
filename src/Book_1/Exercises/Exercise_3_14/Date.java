package Book_1.Exercises.Exercise_3_14;

public class Date {

    private int _newMonth;
    private int _newDay;
    private int _newYear;

    public Date(int newMonth, int newDay, int newYear) {
        this._newMonth = newMonth;
        this._newDay   = newDay;
        this._newYear  = newYear;
    }

    public void setMonth(int newMonth) {
        this._newMonth = newMonth;
    }

    public void setDay(int newDay) {
        this._newDay = newDay;
    }

    public void setYear(int newYear) {
        this._newYear = newYear;
    }

    public int getMonth() {
        return this._newMonth;
    }

    public int getDay() {
        return this._newDay;
    }

    public int getYear() {
        return this._newYear;
    }
}
