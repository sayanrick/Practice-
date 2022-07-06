package com.java;

public class Fix {
    String name;
    int rollNo;
    private Fix(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    void display(){
        System.out.println("Private Constructor");
    }
}

class Driver{
    public static void main(String[] args) {
        Fix obj = new Fix("Sayan", 170016);
    }
}
