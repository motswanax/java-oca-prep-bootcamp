package introToObjects;

/**
 * Demo of objects using data
 *
 * @author bad
 */
public class MyDate {
    int day;
    int year;
    int month;

    MyDate(){}

    MyDate(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    {
        day = 1;
        month = 1;
        year = 2000;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    void setDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }
}
