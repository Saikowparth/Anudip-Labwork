package com.Anudip;

public class Test2 implements MyMethods {
    double r=2,area;
    public void display(){
        System.out.println("this is a circle");
    }
    public void accept(){
        area=3.14*r*r;
        System.out.println(area);
    }
    public static void main(String[]args){
        Test2 obj=new Test2();
        obj.display();
        obj.accept();
    }
}
