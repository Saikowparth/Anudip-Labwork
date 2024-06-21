package com.Anudip;

public class Ques2 {
    public static void main(String[] args){
        try{
            // Divide by zero exception
            int i = 50/0; // This will throw an ArithmeticException

            int []arr = new int[5];
            arr[5] = 3; // This will throw an ArrayIndexOutOfBoundsException

            int j = Integer.parseInt("number"); // This will throw an NumberFormatException

            // Null pointer exception
            String str = null;
            int length = str.length(); // This will throw a NullPointerException
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);
        }
        catch(NumberFormatException ex){
            System.out.println(ex);
        }
        catch(NullPointerException nl){
            System.out.println(nl);
        }
    }
}