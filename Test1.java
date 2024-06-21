package com.Anudip;

public class Test1 implements MyMethods {
    public int l=5, b=6, area;

    public void display(){
        System.out.println("this is a rectangle");
    }
    public void accept(){
        area = l*b;
        System.out.println(area);
    }
    public static void main(String[]args){
        Test1 obj=new Test1();
        obj.display();
        obj.accept();
    }
}
