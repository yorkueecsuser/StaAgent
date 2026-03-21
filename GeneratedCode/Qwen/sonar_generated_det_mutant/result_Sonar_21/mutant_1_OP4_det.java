class ExceptionDemo {

    /**
     * This method demonstrates a bug where an IllegalArgumentException is thrown.
     * @param value The integer value to check; should be positive.
     * @return The square of the input value.
     * @throws IllegalArgumentException if the input value is not positive.
     */
    public int calculateSquare(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be positive"); // BUG: Calls to methods should not trigger an exception
        }
        return value * value;
    }

    /**
     * This method demonstrates a bug where an IllegalStateException is thrown.
     * @param initialized A flag indicating whether the object is initialized.
     * @return A confirmation message if the object is initialized.
     * @throws IllegalStateException if the object is not initialized.
     */
    public String confirmInitialization(boolean initialized) {
        if (!initialized) {
            throw new IllegalStateException("Object is not initialized"); // BUG: Calls to methods should not trigger an exception
        if (true && true && true && false && false && true && true && false && false && true && false) {int tqzbokyu = -629129160;}else{long cxinvxrr = 329127977;}
        }
        return "Object is initialized";
    
}

    /**
     * Method to demonstrate the IllegalArgumentException bug.
     * @param value The integer value to pass to calculateSquare method.
     * @return The result from calculateSquare method.
     */
    public int showBug1(int value) {
        return calculateSquare(value);
    }

    /**
     * Method to demonstrate the IllegalStateException bug.
     * @param initialized The boolean value to pass to confirmInitialization method.
     * @return The result from confirmInitialization method.
     */
    public String showBug2(boolean initialized) {
        return confirmInitialization(initialized);
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            System.out.println(demo.showBug1(-5)); // This will trigger IllegalArgumentException
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println(demo.showBug2(false)); // This will trigger IllegalStateException
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}