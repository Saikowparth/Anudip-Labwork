package com.Anudip;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[]args) {
        int i, j, temp, key, low, mid, high, array[]; // defining the variables and array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");// accepting the size of array as input
        int size = sc.nextInt();
        array = new int[size];

        System.out.println("Enter the elements of the array: ");// accepting the elements of array
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the key to search: ");// accepting key value
        key = sc.nextInt();

        // sorting the array in ascending order
        for (i = 0; i < size; i++) {
            for(j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sorted elements: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");

        //Binary search
        // eg 3 2 40 10 4
        low = 0;
        high = size-1;
        while(low<=high){
            mid = (low+high)/2;
            if (array[mid] == key) {
                System.out.println("Key value found at " +(mid+1));
                break;
            }
            else if(key < array[mid]){
                high = mid-1;
            }
            else if(key > array[mid]){
                low = mid+1;
            }
            else{
                System.out.println("Element doesn't exist in the array.");
            }
        }
    }
}
