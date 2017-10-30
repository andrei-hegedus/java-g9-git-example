package ro.siit.emploiyeestats;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by andrei on 10/30/17.
 */
public class EmployeeStatsUI {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee(new Employee("Jim", 500, getDateFor(2017, 1, 12)));
        employees.addEmployee(new Employee("Mike", 200, getDateFor(2015, 7, 20)));
        employees.addEmployee(new Employee("Craig", 300, getDateFor(2016, 7, 20)));
        EmployeeStats employeeStats = new EmployeeStats(employees);
        
        System.out.println("What would you like to know?");
        System.out.println("\t1. Best payed employee's name.");
        System.out.println("\t2. Most senior employee's name.");
        System.out.println("\t3. Exit");
        System.out.println("\nType the number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                Employee e1 = employeeStats.getEmployeeWithHighestSalary();
                System.out.println("Best payed is "+e1.getName());
                break;
            case 2:
                Employee e2 = employeeStats.getEmployeeWithHighestSeniority();
                System.out.println("Most Senior is "+e2.getName());
                break;
            case 3:
                System.exit(0);
        }
    }

    private static Date getDateFor(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }
}
