package com.cognizant.loan;

public class Loan {
    private String number;
    private String type;
    private double amount;

    public Loan(String number, String type, double amount) {
        this.number = number;
        this.type = type;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
