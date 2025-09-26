package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {

    public static void main(String[] args) {

        /*
            A calculator that determines the future value of a
            one-time deposit assuming compound interest - it is used to help
            you decide how much a CD will be worth when it matures
            a. It would accept the deposit, interest rate, and number of
            years from the user
            b. It would display the future value and the total interest
            earned
            Example: If you deposit $1,000 in a CD that earns 1.75%
            interest and matures in 5 years, your CD's ending balance will
            be $ 1,091.44 and you would have earned $91.44 in interest
            Note: The numbers above assume daily compounding
            FV = P × (1 + (r / 365) )^(365 × t)
            • Future Value (FV) =
            o Principal (P):
            - This is the initial deposit amount.
            o Annual Interest Rate (r):
            - The nominal annual interest rate in decimal form.
            (e.g., 1.75% = 0.0175).
            o Number of Years (t):
            - The total number of years the deposit will earn interest.
            o Days Per Year:
            - Daily compounding assumes 365 days per year.
            o Total Number of Days:
            - This is 365 × t (because there are 365 days per year).
            • Total Interest Earned = FV - P
         */

        // Declare userInput Scanner object to store system input
        Scanner userInput = new Scanner(System.in);

        // Print message to user requesting principle
        System.out.print("Welcome to the Future Value Calculator!\nEnter your principle: ");

        // Read next double input and store the value in the principle variable, principle = p
        double principle = userInput.nextDouble();

        // Print message to user requesting interest rate
        System.out.print("Enter your annual interest rate(e.g 1.25% as 1.25: ");

        // Read next double input and store the value in the annualInterestRate variable, annualInterestRate = r
        double annualInterestRate = (userInput.nextDouble()/100);

        // Print message to user requesting number of years
        System.out.print("Enter number of years: ");

        // Read next double input and store the value in the numYears variable, numYears = t
        double numYears = userInput.nextDouble();

        // Declare and initialize the dayPerYear variable, daysPerYear = d
        double daysPerYear = 365;

        // Declare and initialize the totalDays variable, totalDays = d * t
        double totalDays = daysPerYear * numYears;

        // Declare and initialize the futureValue variable, futureValue = FV  = P × (1 + (r / d) )^(d × t)
        double futureValue = principle * Math.pow((1 + ( annualInterestRate / daysPerYear )), (daysPerYear * numYears));

        // Declare and initialize the totalInterest variable, totalInterest = FV - P
        double totalInterest = futureValue - principle;

        // Print the future value and total interest earned
        System.out.printf("If you deposit $%,.2f in a CD that earns %.2f%% interest and\nmatures in %.0f years, your CD's ending balance will be $%,.2f\nand you would have earned $%,.2f in interest.",
                principle, (annualInterestRate * 100), numYears, futureValue, totalInterest);

    }

}
