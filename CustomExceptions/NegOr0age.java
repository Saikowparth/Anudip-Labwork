package com.Anudip;
import java.util.Scanner;
public class NegOr0age {
    public void check(int a){
        if(a==0){
            throw new ArithmeticException("you input age as 0!"); // checks if age is 0 and throws exception
        }
        else if(a<0){
            throw new ArithmeticException("you entered a negatve age!"); // checks if age entered is -ve and throws exception
        }
        else{
            System.out.println("your age: "+a); // simply prints the age
        }
    }
    public static void main(String[] args){
        NegOr0age obj = new NegOr0age(); // creating an object of the class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();// takes input
        obj.check(age); // checks the input
    }
}
