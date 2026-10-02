package topic05_oop;

/**
 * Let's upgrade your design habits by encapsulating a data object. Create a class named Employee and an execution tester class named EncapsulationChallenge:
 * 1. Employee Class:
 * 	• Create two private fields: String name and double salary.
 * 	• Create a Constructor that accepts both fields as parameters to initialize the object state immediately.
 * 	• Provide a public Getter for name.
 * 	• Provide a public Getter and Setter for salary.
 * 	• Validation Rule: Inside the setSalary method, only update the field if the new salary input is greater than 0. Otherwise, print an error message.
 * 2. EncapsulationChallenge Class (main method):
 * 	• Instantiate an Employee object using your constructor (e.g., "Bob", 4000.0).
 * 	• Try to update their salary to a negative number (e.g., -500.0) using the setter to verify your validation works.
 * 	• Update the salary to a valid positive value and print out their final name and salary using the getters.
 */
class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("Error setting salary");
            return;
        }
        this.salary = salary;
    }
}

public class EncapsulationChallenge {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 4000.0);
        employee.setSalary(-500.0);
        employee.setSalary(500.0);
        System.out.println("Name of employee: " + employee.getName() + " and his salary is: " + employee.getSalary());
    }
}
