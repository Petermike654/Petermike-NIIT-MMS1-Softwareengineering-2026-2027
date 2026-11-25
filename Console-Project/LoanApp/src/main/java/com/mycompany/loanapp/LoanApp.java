package com.mycompany.loanapp;

import java.util.Scanner;

public class LoanApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double loanAmount, monthlyPrincipal, remainingBalance;
        double monthlyInterest, totalMonthlyPayment, totalInterest = 0;
        double interestRate = 1.5;
        int months;

        System.out.println("LOAN APPLICATION");
        System.out.println();

        try {

            System.out.println("Enter Loan Amount:");
            loanAmount = input.nextDouble();

            System.out.println("Enter Loan Duration (in months):");
            months = input.nextInt();

            monthlyPrincipal = loanAmount / months;
            remainingBalance = loanAmount;

            System.out.println();
            System.out.println("========== LOAN BREAKDOWN ==========");
            System.out.println("Month\tMonthly Payment\tMonthly Interest\tTotal Monthly Payment");

            for (int count = 1; count <= months; count++) {
                monthlyInterest = remainingBalance * interestRate / 100;
                totalMonthlyPayment = monthlyPrincipal + monthlyInterest;
                totalInterest = totalInterest + monthlyInterest;

                System.out.printf("%d\tNGN %.2f\t\tNGN %.2f\t\tNGN %.2f\n",
                        count, monthlyPrincipal, monthlyInterest, totalMonthlyPayment);

                remainingBalance = remainingBalance - monthlyPrincipal;
            }

            System.out.println();
            System.out.println("========== LOAN SUMMARY ==========");
            System.out.println("Interest Rate   = " + interestRate + "%");
            System.out.println("Total Interest  = " + totalInterest);
            System.out.println("Total Payment   = " + (loanAmount + totalInterest));
            System.out.println("=============================");

        } catch (Exception e) {
            System.out.println();
            System.out.println("Error: Invalid input! Please enter numbers only.");
        }
    }
}

