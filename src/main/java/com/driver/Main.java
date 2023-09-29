package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

//        obj.name = "Shiv";
//        System.out.print(obj.name);
        // java: name has private access in com.driver.RWOnly

        obj.setter("Shiv");

        System.out.print(obj.getter());
    }
}