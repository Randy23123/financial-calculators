package com.pluralsight;

import java.util.Scanner;

public class Calc3 {
    public static void main(String[] args) {
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
        double TotalPayout =  payout * ((1 - Math.pow((1 + interest) , (- 1 * years * 12))) / interest);
        System.out.printf("Your total payout is: %.2f" , TotalPayout);
    }
}
