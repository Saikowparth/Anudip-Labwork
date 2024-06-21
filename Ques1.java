package com.Anudip;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int i = sc.nextInt(); // Takes user input
        }
        catch(InputMismatchException e){
            System.out.println(e); // If the user input is not an integer, it shows InputMismatchException
        }
    }
}
