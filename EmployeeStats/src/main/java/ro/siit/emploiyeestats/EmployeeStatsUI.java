package ro.siit.emploiyeestats;

/**
 * Created by andrei on 10/30/17.
 */
public class EmployeeStatsUI {

    public static void main(String[] args) {
        Employees employees = new Employees();
        EmployeeStats employeeStats = new EmployeeStats(employees);
        Employee e1 = employeeStats.getEmployeeWithHighestSalary();
        Employee e2 = employeeStats.getEmployeeWithHighestSeniority();
    }
}
