package com.Anudip;
import java.util.Scanner;
class CarLoan implements Loan {
    double principal;
    double rate;
    int time;

    // Implement loanAmount method for CarLoan
    public double loanAmount() {
        return (principal * rate * time) / 100;
    }

    // Implement accept method for CarLoan
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car price: ");
        principal = scanner.nextDouble();
        System.out.println("Enter interest rate: ");
        rate = scanner.nextDouble();
        System.out.println("Enter time period (in years): ");
        time = scanner.nextInt();
    }
    public static void main(String[] args) {
        // Create objects of CarLoan
        CarLoan carLoan = new CarLoan();

        System.out.println("Enter Car Loan Details:");
        carLoan.accept();

        // Calculate and display loan amounts for CarLoan
        System.out.println("Car Loan Amount: " + carLoan.loanAmount());
    }
}

