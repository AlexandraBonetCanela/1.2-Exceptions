package org.alexandra;

public class EmptySaleException  extends Exception {

    public EmptySaleException() {
        super();
    }

    public EmptySaleException(String errorMessage) {
        super(errorMessage);
    }
}
