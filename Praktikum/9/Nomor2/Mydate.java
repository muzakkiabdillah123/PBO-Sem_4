package Nomor2;

import java.util.GregorianCalendar;

class Mydate {
    private int day;
    private int month;
    private int year;

    Mydate() {
        GregorianCalendar cal = new GregorianCalendar();
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        month = cal.get(GregorianCalendar.MONTH);
        year = cal.get(GregorianCalendar.YEAR);
    }

    Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Mydate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        month = cal.get(GregorianCalendar.MONTH);
        year = cal.get(GregorianCalendar.YEAR);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
