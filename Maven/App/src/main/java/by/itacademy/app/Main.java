package by.itacademy.app;

import by.itacademy.entity.Employee;
import by.itacademy.repository.Repository;
import by.itacademy.repository.RepositoryFactory;
import by.itacademy.repository.cache.RepositoryCache;
import by.itacademy.service.Calculation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository repository = RepositoryFactory.buildRepository();
        List<Employee> employees = repository.getEmployees();
        for (Employee employee : employees) {
            int year = 2020;
            int startPeriod = 1;
            int endPeriod = 12;
            var avarageSalary = Calculation.calcAvarageSalary(employee.getAccruedSalary(), year, startPeriod, endPeriod);
            var basedOnSalary = Calculation.getSalariesInString(employee.getAccruedSalary(), year, startPeriod, endPeriod);
            System.out.println(String.format("Employee %s has avarage salary %d, based on %s", employee.getName(), avarageSalary, basedOnSalary));
        }
    }
}
