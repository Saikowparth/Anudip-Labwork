package com.Anudip;
import java.util.Scanner;
public class DescendingSortLab {
    Scanner sc = new Scanner(System.in);
    int i, j, temp, size, arr[];
    public void accept(){ // accepting size and elements
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.print("Enter the elements: ");
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
    }
    public void sort(){ // sorting in descending order
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void display(){ // displaying the elements
        System.out.println("Sorted elements in descending order: ");
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        DescendingSortLab obj = new DescendingSortLab(); // creating an object of the class
        obj.accept();
        obj.sort();
        obj.display();
    }
}
