package com.yourname;

public class Main {
    public static void main(String[] args) {
        Hourly hourlyEmployee = new Hourly("John", "Doe", 15.0, 45.0);
        System.out.println(hourlyEmployee.toString() + " Weekly Pay: $" + hourlyEmployee.WeeklyPay());

        Salary salaryEmployee = new Salary("Jane", "Smith", 52000.0);
        System.out.println(salaryEmployee.toString() + " Weekly Pay: $" + salaryEmployee.WeeklyPay());

        Contract contractEmployee = new Contract("Alice", "Johnson", 2000.0, 4);
        System.out.println(contractEmployee.toString() + " Weekly Pay: $" + contractEmployee.WeeklyPay());
    }
}
