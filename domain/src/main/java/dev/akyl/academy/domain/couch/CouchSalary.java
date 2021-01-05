package dev.akyl.academy.domain.couch;

import dev.akyl.academy.domain.user.User;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class CouchSalary {

    private User couch;
    private Map<Period, BigDecimal> accuredSalary;

    public User getCouch() {
        return couch;
    }

    public void setCouch(User couch) {
        this.couch = couch;
    }

    public Map<Period, BigDecimal> getAccuredSalary() {
        return accuredSalary;
    }

    public void setAccuredSalary(Map<Period, BigDecimal> accuredSalary) {
        this.accuredSalary = accuredSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouchSalary that = (CouchSalary) o;
        return Objects.equals(couch, that.couch) &&
                Objects.equals(accuredSalary, that.accuredSalary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couch, accuredSalary);
    }

    @Override
    public String toString() {
        return "CouchSalary{" +
                "couch=" + couch +
                ", accuredSalary=" + accuredSalary +
                '}';
    }
}
