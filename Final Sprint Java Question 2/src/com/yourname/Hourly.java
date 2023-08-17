package com.yourname;

public class Hourly extends Employee {
    private double rate;
    private double hours;

    public Hourly(String firstName, String lastName, double rate, double hours) {
        super(firstName, lastName);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double WeeklyPay() {
        double pay = 0.0;
        if (hours <= 40.0)
            pay = rate * hours;
        else
            pay = (hours - 40.0) * 1.5 * rate + 40.0 * rate;
        return pay;
    }

    @Override
    public double GetAmount() {
        return WeeklyPay();
    }
}
