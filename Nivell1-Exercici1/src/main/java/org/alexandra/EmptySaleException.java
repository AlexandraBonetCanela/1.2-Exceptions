package org.alexandra;

public class EmptySaleException  extends Exception {


    public EmptySaleException() {
        super("You first need to add products to the basket in order to process the order");
    }
}
