package com.pluralsight;

import java.util.Scanner;

//add imports
public class FinancialCalculators {

    //add scanners
    static Scanner myScanner = new Scanner(System.in);

    //add main
    public static void main(String[] args) {

        //add menu to pick which calculator you'd want to use
        boolean running = true;

        while (running) {
            System.out.println(" ~~~~~ Mikayla's Financial Calculato r~~~~");
            System.out.println("1 - Mortgage Calculator");
            System.out.println("2 - Future Value Calculator");
            System.out.println("3 - Present Value Annuity");
            System.out.println("0 - Exit");
            System.out.print("Choose calculator: ");

            int choice = Integer.parseInt(myScanner.nextLine());

            //add switch to work with user choice

            switch (choice) {

                case 1:
                    mortgageCalculator();
                    break;

                case 2:
                    futureValueCalculator();
                    break;

                case 3:
                    presentValueCalculator();
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("Done!");
    }

        //add mortgagae calculator logic
        public static void mortgageCalculator() {

        //get user inputs fpr each variable and assign data to variable

            System.out.print("Enter loan principal: ");

            double principal = Double.parseDouble(myScanner.nextLine());

            System.out.print("Enter annual interest rate (%): ");

            double annualInterestRate = Double.parseDouble(myScanner.nextLine());

            System.out.print("Enter loan length in years: ");

            int years = Integer.parseInt(myScanner.nextLine());

            //add calc for interest
            double monthlyInterestRate = (annualInterestRate / 100) / 12;
            //add calc for amount payments
            int numberOfPayments = years * 12;

            //add monthly payment math from parsed variables user entered
            double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                            /
                            (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

            //add logic ofr total interest
            double totalInterest = (monthlyPayment * numberOfPayments) - principal;

            //display monthly interest and total interest
            System.out.printf("\nMonthly Payment: $%.2f%n", monthlyPayment);
            System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);
        }


// add future value calculations logic
public static void futureValueCalculator() {

        //ask user for info necessary to get future value and assign into variable

    System.out.print("Enter deposit amount: ");
    double principal = Double.parseDouble(myScanner.nextLine());

    System.out.print("Enter annual interest rate (%): ");
    double annualInterestRate = Double.parseDouble(myScanner.nextLine());

    System.out.print("Enter number of years: ");
    int years = Integer.parseInt(myScanner.nextLine());

    //add calc for future value
    double futureValue = principal * Math.pow( 1 + ((annualInterestRate / 100) / 365), 365 * years);
    //add calc for total interest
    double totalInterest = futureValue - principal;

    //print out calculations
    System.out.printf("\nFuture Value: $%.2f%n", futureValue);
    System.out.printf("Interest Earned: $%.2f%n", totalInterest);

//add present value calculations logic


    }



}
