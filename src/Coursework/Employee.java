package Coursework;

import javax.lang.model.element.Name;
import java.util.Objects;

public class Employee {
    private String Name;
    private String LastName;
    private String MiddleName;
    private int Department;
    private int Salary;
    private int Id;
    private static int counter = 0;

    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.Name;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getMiddleName() {
        return this.MiddleName;
    }

    public int getDepartment() {
        return this.Department;
    }

    public int getSalary() {
        return this.Salary;
    }

    public void setDepartment(int department) {
        this.Department = department;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public Employee(String name, String lastName, String middleName, int department, int salary) {
        Name = name;
        LastName = lastName;
        MiddleName = middleName;
        Department = department;
        Salary = salary;
        Id = counter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", Department=" + Department +
                ", Salary=" + Salary +
                ", Id=" + Id +
                '}';
    }
}

