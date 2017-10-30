package ro.siit.emploiyeestats;

import java.util.Date;

/**
 * Created by andrei on 10/30/17.
 */
public class Employee {

    private String name;
    private float salary;
    private Date hireDate;

    public Employee(String name, float salary, Date hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

}
