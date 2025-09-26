package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        /*
            A mortgage calculator - it is used to calculate out
            how much a monthly payment for a loan would be (minus any
            insurance or taxes), as well as how much interest you would pay
            over the life of the loan.
            a. It would accept the principal, interest rate, and loan length
            from the user
            b. It would display the expected monthly payment and total
            interest paid
            Example: A $53,000 loan at 7.625% interest for 15 years would
            have a $495.09/mo payment with a total interest of $36,115.99
            This calculator would use a compounded interest formula.
         */

        // Declare and initialize the userInput Scanner object to read input.
        Scanner userInput = new Scanner(System.in);

        // Print out message requesting value for the principle variable, principle = p
        System.out.println("Welcome to Mortgage Calculator!\nTo begin enter your principle:");

        // Declare and initialize the principle variable to store the total amount of the loan
        double principle = userInput.nextDouble();

        // Print out a message requesting a value for the annualInterestRate variable , annual interest rate = r
        System.out.println("Enter your annual interest rate (e.g. enter 7.625% as 7.625:");

        // Declare and initialize the annualInterestRate variable to store the annual interest rate
        double annualInterestRate = (userInput.nextDouble() / 100);

        // Print out a message requesting a value for the loanTerm value
        System.out.println("Enter the length of your loan:");

        // Declare and initialize the loanTerm variable to store how many years the loan lasts, loan term = y
        double loanTerm = userInput.nextDouble();

        // Declare and initialize the monthlyPaymentCount to store how many monthly payments are made in a year , n = 12 × y
        double monthlyPaymentCount = loanTerm * 12;

        // Declare and initialize the monthlyInterestRate variable to store the monthly interest rate, i = r/12
        double monthlyInterestRate = annualInterestRate / 12;

        // Declare and initialize the monthlyPayments variable to store the monthly payment for a loan , M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)
        double monthlyPaymentAmount = principle * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, monthlyPaymentCount)) / (( Math.pow(1 + monthlyInterestRate, monthlyPaymentCount) ) - 1));

        // Declare and initialize the totalInterest variable to store the total interest due, total interest = (M * n) - p
        double totalInterest = (monthlyPaymentAmount * monthlyPaymentCount) - principle;

        // Print out a message displaying monthlyPayments variable
        System.out.printf("A $%,.2f loan at %.3f%% interest for %.0f years would have a $%.2f/mo payment with a total interest of $%.2f.",
                principle, (annualInterestRate * 100), loanTerm, monthlyPaymentAmount, totalInterest);

    }

}
