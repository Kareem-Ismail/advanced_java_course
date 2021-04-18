package Part1.oop;

import java.util.ArrayList;
import java.util.List;

public class HR {
    List<Employee> employees = new ArrayList<>();

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean fireEmployee (Employee employee) {
        return employees.remove(employee);
    }

    public void payEmployees () {
        employees.forEach(employee -> {
            System.out.printf("Paying %s %f", employee.getName(), employee.getPay());
        });
    }
}
