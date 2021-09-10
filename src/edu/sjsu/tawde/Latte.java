package edu.sjsu.tawde;

/**
 * A class called Latte that has no attributes or methods of its own, aside from the main() method.
 */
public class Latte {

    /**
     * Method that tests the Coffee class through the creation of an object and use of methods the class gives access to.
     * @param args
     */
    public static void main(String[] args) {
        Coffee inLatteClass = new Coffee("Iced Caramel Latte");
        System.out.println(inLatteClass.toString());
    }
}
