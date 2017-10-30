package ro.siit.emploiyeestats;

import java.util.Date;

/**
 * Created by andrei on 10/30/17.
 */
public class EmployeeStats {

    private Employees employees;

    public EmployeeStats(Employees employees) {
        this.employees = employees;
    }

    public Employee getEmployeeWithHighestSalary() {
        return new Employee("John", 500, new Date());
    }

    public Employee getEmployeeWithHighestSeniority() {
        return new Employee("Jim", 500, new Date());
    }
}
