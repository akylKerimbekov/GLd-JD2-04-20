package by.itacademy.app;

import by.itacademy.entity.Employee;
import by.itacademy.repository.Repository;
import by.itacademy.service.Calculation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Repository.getEmployees();
        for (Employee employee : employees) {
            var avarageSalary = Calculation.calcAvarageSalary(employee.getAccruedSalary(), 2020, 1, 12);
            var basedOnSalary = Calculation.getSalariesInString(employee.getAccruedSalary(), 2020, 1, 12);
            System.out.println(String.format("Employee %s has avarage salary %d, based on %s", employee.getName(), avarageSalary, basedOnSalary));
        }
    }
}
