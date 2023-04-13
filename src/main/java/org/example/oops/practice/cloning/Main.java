package org.example.oops.practice.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee();
        emp1.Name = "Mukesh Challa";
        emp1.employeeID = 1772735;
        emp1.last3MontsSal = new long[]{980000,9834634, 9838663};

        Employee employee = emp1.clone();

        System.out.println(employee.toString());
    }
}
