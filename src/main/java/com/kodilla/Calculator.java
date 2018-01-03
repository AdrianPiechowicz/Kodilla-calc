package com.kodilla;

public class Calculator {

    public void getStarted(){
        System.out.println("Hello, this is a simple calculator! :)");
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int subtraction(int a,int b){
        return a-b;
    }

    public static void main(String args[]){
        Calculator kalk = new Calculator();
        kalk.getStarted();
        int a = 5;
        int b=2;
        System.out.println("Two selected numbers are "+a+" and "+b+ " sum of those equals "+kalk.sum(a,b)+" subtraction equals "+kalk.subtraction(a,b));
    }
}
