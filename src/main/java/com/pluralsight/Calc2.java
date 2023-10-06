package com.pluralsight;

import java.util.Scanner;

public class Calc2 {
    public static void main(String[] args) {
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
        double total = deposit * Math.pow(interest +1 , years);

        double TotalInterest = total - deposit;
        System.out.printf("Your total is: %.2f" , total);
        System.out.println();
        System.out.printf("Your total interest is: %.2f" ,TotalInterest);
    }
}
