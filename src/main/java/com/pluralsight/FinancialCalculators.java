package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is your principal on your loan?: ");
        double principal = scanner.nextDouble();
        System.out.println(principal);

        System.out.println("Whats your interest rate?: ");
        double interest = scanner.nextDouble();
        System.out.println(interest);

        System.out.println("Whats the length of your loan?: ");
        double loan = scanner.nextDouble();
        System.out.println(loan);

        interest = interest / 1200;
        double MonthlyPayments = principal * interest / (1 - Math.pow((1 + interest),(-1 * (loan * 12))));
        System.out.printf("your monthly payment is: $%.2f" , MonthlyPayments);
        System.out.println();
        System.out.printf("%.2f", (MonthlyPayments * (loan * 12) - principal));
    }
}
