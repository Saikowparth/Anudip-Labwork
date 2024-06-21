package com.Anudip;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args){
        int i,len,key,array[];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        len = input.nextInt();
        array = new int[len];

        System.out.print("Enter "+len+" numbers: ");
        for(i=0;i<len;i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter the search key value: ");
        key = input.nextInt();
        for(i=0;i<len;i++){
            if(array[i]==key){
                System.out.println("Key found at: "+(i+1));
                break;
            }
        }
        if(i==len) {
            System.out.println("Key doesn't exist in the array");
        }
    }
}
