/**
 * A date class with the Dates in between 1/1/2014 and 31/12/2024. This class
 * assumes that all months have 31 days and there are no leap years.
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int month, int day, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public Date(Date date) {
        this(date.month, date.day, date.year);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year >= 2014 && year <= 2024) {
            this.year = year;
        }
        else {
            throw new IllegalArgumentException("Year is out of range.");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
        else {
            throw new IllegalArgumentException("Month is out of range.");
        }
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
        else {
            throw new IllegalArgumentException("Day is out of range.");
        }
    }

    /**
     * Checks if a Date is after this, up to the precision of the day.
     *
     * @param other the Other object to compare to
     * @return Returns true if other is after this.
     */
    public boolean isAfter(Date other) {
        return this.year > other.year || this.year == other.year &&
                (this.month > other.month || this.month == other.month &&
                        this.day > other.day);
    }

    /**
     * Returns true if 2 objects are equal.
     *
     * @param obj Object (Date) to compare to.
     * @return true if the two Dates are equal.
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Date &&
                this.year == ((Date) obj).year && this.month == ((Date) obj).month && this.day == ((Date) obj).day;
    }

    @Override
    public String toString() {
        return (this.month > 10 ? ("0" + this.month) : this.month) + "/" +
                (this.day > 10 ? ("0" + this.month) : this.day) + "/" +
                this.year;
    }
}