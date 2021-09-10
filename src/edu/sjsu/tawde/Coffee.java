package edu.sjsu.tawde;

/**
 * Coffee class which contains the minimum one attribute and main() method.
 */
public class Coffee {

    private String drinkName;

    /**
     * Creates a Coffee object where default value for the class attribute is assigned ("Black Coffee")
     */
    public Coffee() {
        this.drinkName = "Black Coffee";
    }

    /**
     * Creates a Coffee object where attribute value is set to the value of the parameter drinkName that was passed in.
     * @param drinkName A String that is passed in at the creation of a Coffee object. It represents the name of a drink of the user's choosing.
     */
    public Coffee(String drinkName) {
        this.drinkName = drinkName;
    }

    /**
     * Takes value of attribute and returns (since it is already a String).
     * @return Value of attribute drinkName in this object.
     */
    public String toString() {
        return this.drinkName;
    }

    /**
     * Method that tests the Coffee class through the creation of objects and use of methods the class gives access to.
     * @param args A String array that you can pass into main(); e.g. if you use it on the command line.
     */
    public static void main(String[] args) {
        Coffee inputTest = new Coffee("Macchiato");
        System.out.println("My favorite drink is a " + inputTest.toString());
        Coffee defaultTest = new Coffee();
        System.out.println("The default drink is a " + defaultTest.toString());
    }
}
