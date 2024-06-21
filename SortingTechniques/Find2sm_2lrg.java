package com.Anudip;
import java.util.Scanner;
public class Find2sm_2lrg {
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
    public void secondlargest(){ // finding second largest element
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest of the array: "+arr[1]);

    }public void secondSmallest(){ // finding second smallest element
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second smallest of the array: "+arr[1]);
    }
    public static void main(String[]args){
        Find2sm_2lrg obj = new Find2sm_2lrg(); // creating an object of the class
        obj.accept();
        obj.secondlargest();
        obj.secondSmallest();
    }
}
