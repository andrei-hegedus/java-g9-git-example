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
        Employee bestPayed = new Employee("Dummy", 0, new Date());
        for (Employee e : employees.getEmployees()) {
            if (e.getSalary() > bestPayed.getSalary()) {
                bestPayed = e;
            }
        }
        return bestPayed;
    }

    public Employee getEmployeeWithHighestSeniority() {
        Employee oldest = new Employee("Dummy", 0, new Date());
        for(Employee e : employees.getEmployees()){
            if(e.getHireDate().compareTo(oldest.getHireDate())<0){
                oldest = e;
            }
        }
        return oldest;
    }
}
