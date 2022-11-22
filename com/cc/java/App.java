package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        new Cat();
        Cat cat = new Cat();                // Jede Klasse ist ein Datentyp!
        output("Blick von aussen: " + cat);
        cat.tellYourAddress();

        output("-------------------");

        Cat cat1 = new Cat();                
        output("Blick von aussen: " + cat1);
        cat1.tellYourAddress();
    }

    public static void output(String string) {
        System.out.println(string);
    }



}

