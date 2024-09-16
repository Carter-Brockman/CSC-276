//In this program, The user will input details about their account, interest rate, and how long they let it sit
//All this determines the total amount in a given account after that time has passed, based on their interest rate

import java.util.Scanner;

public class Bank {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        //In the first section, we take details about the user's checking account

        int checkingDurationInYears;
        float checkingUserBalance;
        float checkingInterestRate;
        float checkingAfterInterest = 0;
        float checkingInterestEarned;

        System.out.print("Enter the balance of your checking account: $");
        checkingUserBalance = userInput.nextFloat();

        System.out.print("\nEnter the interest rate percentage: ");
        checkingInterestRate = userInput.nextFloat();
        checkingInterestRate /= 100;

        System.out.print("\nEnter the duration, in years, the interest will accrue: ");
        checkingDurationInYears = userInput.nextInt();

        checkingAfterInterest = checkingUserBalance + (checkingUserBalance * checkingInterestRate * checkingDurationInYears);
        checkingInterestEarned = checkingAfterInterest - checkingUserBalance;

        System.out.printf("\nIn %d years you will have $%.2f in your checking account, earning $%.2f in interest.\n", checkingDurationInYears, checkingAfterInterest, checkingInterestEarned);

        //Next, we will ask the user to input similar details, but for their savings account

        int savingsDurationInYears;
        float savingsUserBalance;
        float savingsInterestRate;
        float savingsAfterInterest = 0;
        float savingsInterestEarned;

        System.out.print("\nEnter the balance of your savings account: $");
        savingsUserBalance = userInput.nextFloat();

        System.out.print("\nEnter the interest rate percentage: ");
        savingsInterestRate = userInput.nextFloat();
        savingsInterestRate /= 100;

        System.out.print("\nEnter the duration, in years, the interest will accrue: ");
        savingsDurationInYears = userInput.nextInt();

        savingsAfterInterest = savingsUserBalance + (savingsUserBalance * savingsInterestRate * savingsDurationInYears);
        savingsInterestEarned = savingsAfterInterest - savingsUserBalance;

        System.out.printf("\nIn %d years you will have $%.2f in your savings account, earning $%.2f in interest.\n", savingsDurationInYears, savingsAfterInterest, savingsInterestEarned);

        //Now the program will organize a table to display the total amount of money after the interest
        //Additionally, it will display the interest earned within those accounts

        System.out.printf("\n%-22s%18s%21s\n%s\n%-22s%18.2f%21.2f\n%-22s%18.2f%21.2f\n",
                "Bank of Jersey", "Account balance", "Interest accrued",
                "---------------------------------------------------------------",
                "Checking account:", checkingAfterInterest, checkingInterestEarned,
                "Savings account:", savingsAfterInterest, savingsInterestEarned);

    }
}
