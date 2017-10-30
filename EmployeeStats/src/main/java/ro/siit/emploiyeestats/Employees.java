package ro.siit.emploiyeestats;

/**
 * Created by andrei on 10/30/17.
 */
public class Employees {

    private Employee [] employees = new Employee[1000];
    private int employeeCount = 0;

    public void addEmployee(Employee e){
        employees[employeeCount]=e;
        employeeCount++;
    }

    public Employee[] getEmployees() {
        Employee[] nonNullEmployees = new Employee[employeeCount];
        for(int i = 0; i<employeeCount;i++){
            nonNullEmployees[i] = employees[i];
        }
        return nonNullEmployees;
    }
}
