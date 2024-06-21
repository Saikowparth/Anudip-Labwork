package com.Anudip;
import java.util.Scanner;

public class ExceOnOdd {
    public void check(int a){
        if(a%2==0){
            System.out.println("It's even number so welcome!!!"); // checks if input is even
        }
        else{
            throw new ArithmeticException("you entered an odd number!"); // if input is odd throws an exception
        }
    }
    public static void main(String[]args){
    ExceOnOdd obj = new ExceOnOdd();// creating an object of the class
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();// takes input
    obj.check(num);// checks the input
    }
}