package by.itacademy.repository;

import by.itacademy.entity.Employee;
import by.itacademy.entity.Period;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface Repository {
    static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(generateEmployee("Donald Trump"));
        employees.add(generateEmployee("Joe Baiden"));
        employees.add(generateEmployee("Barak Obama"));
        employees.add(generateEmployee("Jeorge Bush"));
        employees.add(generateEmployee("Bill Clinton"));

        return employees;
    }

    static Employee generateEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        HashMap<Period, Integer> accruedSalary = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            accruedSalary.put(new Period(2020, i), by.itacademy.repository.cache.Repository.MIN + (int)(Math.random() * ((by.itacademy.repository.cache.Repository.MAX - by.itacademy.repository.cache.Repository.MIN) + 1)));
        }
        employee.setAccruedSalary(accruedSalary);
        return employee;
    }
}
