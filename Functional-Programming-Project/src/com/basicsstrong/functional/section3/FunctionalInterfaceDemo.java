package com.basicsstrong.functional.section3;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        MyFunInterface myFunInterface = () -> System.out.println("hello world");
        myFunInterface.myMethod();
    }
}
