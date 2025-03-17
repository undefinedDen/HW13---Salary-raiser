package app.repository;

import app.entity.Employee;


public class EmployeeRepository {

    public Employee getBob() {
        return new Employee("Bob", 2000.47);
    }
    public Employee getDenys() {
        return new Employee("Denys", 5000.65);

        }
    public Employee getViktoria() {
        return new Employee("Viktoria", 2056.47);
    }
    public Employee getRoman() {
        return new Employee("Roman", 5000.65);
    }
}