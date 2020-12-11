package by.itacademy.entity;

import java.util.HashMap;
import java.util.Objects;

public class Employee {
    private String name;
    private HashMap<Period, Integer> accruedSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Period, Integer> getAccruedSalary() {
        return accruedSalary;
    }

    public void setAccruedSalary(HashMap<Period, Integer> accruedSalary) {
        this.accruedSalary = accruedSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
