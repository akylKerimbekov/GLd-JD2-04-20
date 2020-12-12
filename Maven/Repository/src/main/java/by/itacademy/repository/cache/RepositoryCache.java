package by.itacademy.repository.cache;

import by.itacademy.entity.Employee;
import by.itacademy.entity.Period;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositoryCache implements by.itacademy.repository.Repository {

    public static final int MIN = 1000;
    public static final int MAX = 10000;

    private static RepositoryCache instance;

    public static RepositoryCache getInstance(){
        if (instance == null) {
            return new RepositoryCache();
        }
        return instance;
    }

    private RepositoryCache(){}

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.add(generateEmployee("Donald Trump"));
        employees.add(generateEmployee("Joe Baiden"));
        employees.add(generateEmployee("Barak Obama"));
        employees.add(generateEmployee("Jeorge Bush"));
        employees.add(generateEmployee("Bill Clinton"));

        return employees;

    }

    private Employee generateEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        HashMap<Period, Integer> accruedSalary = new HashMap<>();
        for (int i = 1; i <= 12; i++) {
            int salary = RepositoryCache.MIN + (int)(Math.random() * ((RepositoryCache.MAX - RepositoryCache.MIN) + 1));
            accruedSalary.put(new Period(2020, i), salary);
        }
        employee.setAccruedSalary(accruedSalary);
        return employee;
    }
}
