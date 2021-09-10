package edu.sjsu.tawde;

public class Coffee {

    private String drinkName;

    // CONSTRUCTOR(S)
    public Coffee() {
        this.drinkName = "Black Coffee";
    }

    // METHOD(S)
    public String toString() {
        return this.drinkName;
    }

    public Coffee(String drinkName) {
        this.drinkName = drinkName;
    }

    public static void main(String[] args) {
        Coffee inputTest = new Coffee("Macchiato");
        System.out.println("My favorite drink is a " + inputTest.toString());
        Coffee defaultTest = new Coffee();
        System.out.println("The default drink is a " + defaultTest.toString());
    }
}
