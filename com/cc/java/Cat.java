package com.cc.java;

public class Cat {
  
    // Variablen immer mit Datentyp zuweisen!
    private String name;   
    private String furColor;
    private int age;


//Constructor erstellen
    public Cat(String name, String furColor, int age){
        this.name = name;
        this.furColor = furColor;
        this.age = age;
}


    public String getName() {
        return name;
    }


    public String getFurColor() {
        return furColor;
    }


    public int getAge() {
        return age;
    }


    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    



// public String tellYourName() {
//     return this.name;
// }
  
// public String tellYourColor(){
//     return this.furColor;
// }

// public int tellYourAge(){
//     return this.age;
// }

// public void chageName(String name){
//     this.name = name;
// }
// public void tellYourAddress(){
//     App.output("Blick von innen: " + this);  //this = Instanzvariabel, Referenz des Objektes auf sich selbst.
// }

}
