package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        // neues Objekt wird erzeugt, Adresse wird cat zugewiesen
        Cat cat = new Cat("Gustavo", "golden-brown", 28);                // Jede Klasse ist ein Datentyp!
        // cat.name = "Gustavo";
        // cat.furColor = "golden-brown";
        // cat.age = 29;
        // output(cat.name);
        // output(cat.furColor);
        // output(String.valueOf(cat.age));
        cat.setFurColor("grey");

        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getAge()));


        // output("Blick von aussen: " + cat);
        // cat.tellYourAddress();

        output("-------------------");

        // Cat cat1 = new Cat();                
        // cat1.name = "Gizelle";
        // cat1.furColor = "snow-white";
        // cat1.age = 23;

        // output(cat1.tellYourName());
        // output(cat1.tellYourColor());
        // output(String.valueOf(cat1.tellYourAge()));
        // output("Blick von aussen: " + cat1);
        // cat1.tellYourAddress();
    }

    public static void output(String string) {
        System.out.println(string);
    }



}

