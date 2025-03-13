package app.entity;

import app.utils.Constants;

public class Customer {
    private String name;
    private double salary;

    public Customer() {
    }

    public Customer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer: " + name  + ", with salary: " + Constants.CURRENCY + " " + salary;
    }
}
