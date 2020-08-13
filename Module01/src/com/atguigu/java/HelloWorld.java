package com.atguigu.java;

public class HelloWorld {

    private static int a;
    private static String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static void main (String [] args){

        a=5;
        b=" ";


        System.out.println(a+b);
    }

}
