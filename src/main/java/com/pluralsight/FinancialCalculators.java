package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What calculator do you want to use:");
        System.out.println("(1)Mortgage\n (2)CD\n (3)Annuity\n");
        int calc = scanner.nextInt();
        if (calc == 1){
            MorgageCalculator();
        }
        else if (calc == 2) {
            CDCalculator();
        }
        else if (calc == 3){
            AnnuityCalculator();
        }
        else {
            System.out.println("Not an option choose 1 2 or 3!");
        }
    }


    public static void MorgageCalculator() {
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
        double MonthlyPayments = principal * interest / (1 - Math.pow((1 + interest), (-1 * (loan * 12))));
        System.out.printf("your monthly payment is: $%.2f", MonthlyPayments);
        System.out.println();
        System.out.printf("%.2f", (MonthlyPayments * (loan * 12) - principal));
    }

    public static void CDCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your deposit amount?: ");
        double deposit = scanner.nextDouble();
        System.out.println(deposit);

        System.out.println("What the interest?: ");
        double interest = scanner.nextDouble();
        System.out.println(interest);

        System.out.println("The number of years?: ");
        double years = scanner.nextDouble();
        System.out.println(years);

        interest /= 100;
        double total = deposit * Math.pow(interest + 1, years);

        double TotalInterest = total - deposit;
        System.out.printf("Your total is: %.2f", total);
        System.out.println();
        System.out.printf("Your total interest is: %.2f", TotalInterest);
    }

    public static void AnnuityCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the monthly payout?: ");
        double payout = scanner.nextDouble();
        System.out.println(payout);

        System.out.println("Whats the interest?: ");
        double interest = scanner.nextDouble();
        System.out.println(interest);

        System.out.println("how many years?: ");
        double years = scanner.nextDouble();
        System.out.println(years);

        interest /= 1200;
        double TotalPayout = payout * ((1 - Math.pow((1 + interest), (-1 * years * 12))) / interest);
        System.out.printf("Your total payout is: %.2f", TotalPayout);
    }
}