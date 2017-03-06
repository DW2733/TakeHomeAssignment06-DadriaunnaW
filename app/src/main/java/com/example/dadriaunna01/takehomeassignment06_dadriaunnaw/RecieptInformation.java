package com.example.dadriaunna01.takehomeassignment06_dadriaunnaw;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 3/5/17.
 */

public class RecieptInformation implements Serializable {
    private double amount;
    private double taxPercentage;
    private double tipPercentage;

    public RecieptInformation(double amount, double taxPercentage, double tipPercentage) {
        this.amount = amount;
        this.taxPercentage = taxPercentage;
        this.tipPercentage = tipPercentage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTaxPercentage() {
        return taxPercentage * 100;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTipPercentage() {
        return tipPercentage * 100;
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    @Override
    public String toString() {
        double grandTotal = amount + (amount * taxPercentage) + (amount * tipPercentage);
        return
                "\n Total=" + amount +
                        "\n Sales Tax=" + taxPercentage * amount +
                        "\n Tip=" + tipPercentage * amount +
                        "\n Grand Total=" + grandTotal;
    }
}
