package com.cc.java;

public class Cat {
  
    // Variablen immer mit Datentyp zuweisen!
    public String name;   
    public String furColor;
    public int age;


//Constructor erstellen
public Cat(String name, String furColor, int age){
    this.name = name;
    this.furColor = furColor;
    this.age = age;
}


public String tellYourName() {
    return this.name;
}
  
public String tellYourColor(){
    return this.furColor;
}

public int tellYourAge(){
    return this.age;
}

public void tellYourAddress(){
    App.output("Blick von innen: " + this);  //this = Instanzvariabel, Referenz des Objektes auf sich selbst.
}

}
