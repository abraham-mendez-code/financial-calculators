package com.pluralsight;

import java.util.Scanner;

public class PresentValueCalculator {

    public static void main(String[] args) {

        /*
            PresentValueCalculator is a calculator that determines the present value of an
            ordinary annuity.
                a. It would accept the monthly payout, expected interest rate,
                and years to pay out from the user
                b. It would display the present value of that annuity

                Example: To fund an annuity that pays $3,000 monthly for 20
                years and earns an expected 2.5% interest, you would need to
                invest $566,141.46 today.
            NOTE: If your results on any of these calculators are off by a few
            pennies (not dollars!), don't worry. The difference is likely attributable
            to rounding and we aren't that concerned about it in this academy.
         */

        // Declare the userInput Scanner object to store input
        Scanner userInput = new Scanner(System.in);

        // Print a message to the user requesting the monthly payment
        System.out.print("Welcome to the Annuity Present Value calculator!\nEnter your monthly payment: ");

        // Read user double input and store it in the monthlyPayment variable, monthlyPayment = p
        double monthlyPayment = userInput.nextDouble();

        // Print message to the user requesting the time in years
        System.out.print("Enter the number of years your will pay: ");

        // Read user double input and store it in the numYears variable
        double numYears = userInput.nextDouble();

        // Print message to the user requesting the annual interest rate
        System.out.print("Enter your annual interest rate: ");

        // Read user double input and store it in the interestRate variable
        double interestRate = (userInput.nextDouble() / 100);

        // Declare and initialize the totalMonths variable, totalMonths = n
        double totalMonths = 12 * numYears;

        // Declare and initialize the monthlyInterestRate variable, monthlyInterestRate = r
        double monthlyInterestRate = interestRate / 12;

        // Declare and initialize the presentValue variable, presentValue = PV = p * ((1 - ( 1 + r )^-n) / r)
        double presentValue = monthlyPayment * ((1- Math.pow((1 + monthlyInterestRate), (-1 * totalMonths))) / monthlyInterestRate);

        // Print out the present value of the annuity
        System.out.printf("To fund an annuity that pays $%,.2f monthly for %,.0f years\nand earns an expected %,.2f%% interest, you would need to\ninvest $%,.2f today."
                , monthlyPayment, numYears, (100* interestRate), presentValue);
    }

}
