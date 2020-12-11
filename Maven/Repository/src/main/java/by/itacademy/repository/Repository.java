package by.itacademy.repository;

import by.itacademy.entity.Employee;
import by.itacademy.entity.Period;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repository {

    public static final int MIN = 1000;
    public static final int MAX = 10000;

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(generateEmployee("Donald Trump"));
        employees.add(generateEmployee("Joe Baiden"));
        employees.add(generateEmployee("Barak Obama"));
        employees.add(generateEmployee("Jeorge Bush"));
        employees.add(generateEmployee("Bill Clinton"));

        return employees;
    }

    private static Employee generateEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        HashMap<Period, Integer> accruedSalary = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            accruedSalary.put(new Period(2020, i), MIN + (int)(Math.random() * ((MAX - MIN) + 1)));
        }
        employee.setAccruedSalary(accruedSalary);
        return employee;
    }


}
