package com.pluralsight;

import java.util.Scanner;

//add imports
public class FinancialCalculators {

    //add scanners
    Scanner myScanner = new Scanner(System.in);

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
        }

        //add 


    }



}
