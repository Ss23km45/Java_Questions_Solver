package org.example.oops.practice.cloning;

import java.util.Arrays;

public class Employee implements Cloneable {
    int employeeID;
    String Name;

    long[] last3MontsSal;

    public Employee clone()  throws CloneNotSupportedException {
        return  (Employee) super.clone();

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", Name='" + Name + '\'' +
                ", last3MontsSal=" + Arrays.toString(last3MontsSal) +
                '}';
    }
}
