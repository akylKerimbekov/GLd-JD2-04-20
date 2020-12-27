package dev.akyl.academy.domain.couch;

import java.util.Objects;

public class Period {
    private int year;
    private int month;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        checkMonth(month);
        this.month = month;
    }

    public Period(int year, int month) {
        checkMonth(month);
        this.year = year;
        this.month = month;
    }

    private void checkMonth(int month){
        if (month < 1 && month > 12) {
            throw new IllegalArgumentException("Месяц должен быть в интервале от 1 до 12");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Period period = (Period) o;
        return year == period.year &&
                month == period.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month);
    }
}
