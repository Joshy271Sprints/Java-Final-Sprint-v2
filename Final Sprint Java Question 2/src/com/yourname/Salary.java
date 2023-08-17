package com.yourname;

public class Salary extends Employee {
    private double annualSalary;

    public Salary(String firstName, String lastName, double annualSalary) {
        super(firstName, lastName);
        this.annualSalary = annualSalary;
    }

    @Override
    public double WeeklyPay() {
        return annualSalary / 52.0;
    }

    @Override
    public double GetAmount() {
        return WeeklyPay();
    }
}
