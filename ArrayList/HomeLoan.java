package com.Anudip;
import java.util.Scanner;
public class HomeLoan implements Loan {
    double principal;
    double rate;
    int time;

    // Implement loanAmount method for HomeLoan
    public double loanAmount() {
        return (principal * rate * time) / 100;
    }

    // Implement accept method for HomeLoan
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        principal = scanner.nextDouble();
        System.out.println("Enter interest rate: ");
        rate = scanner.nextDouble();
        System.out.println("Enter time period (in years): ");
        time = scanner.nextInt();
    }
    public static void main(String[] args) {
        // Create objects of HomeLoan
        HomeLoan homeLoan = new HomeLoan();

        // Accept loan details for HomeLoan
        System.out.println("Enter Home Loan Details:");
        homeLoan.accept();

        // Calculate and display loan amounts for HomeLoan
        System.out.println("Home Loan Amount: " + homeLoan.loanAmount());
    }
}