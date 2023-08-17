package com.yourname;

public class Contract extends Employee {
    private double amount;
    private int weeks;

    public Contract(String firstName, String lastName, double amount, int weeks) {
        super(firstName, lastName);
        this.amount = amount;
        this.weeks = weeks;
    }

    @Override
    public double WeeklyPay() {
        return amount / weeks;
    }

    @Override
    public double GetAmount() {
        return WeeklyPay();
    }
}
