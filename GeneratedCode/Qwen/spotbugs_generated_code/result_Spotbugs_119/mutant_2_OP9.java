class DoubleBitsBug {

    public double showBug(int intValue) {
        // Introducing an equivalent do-while loop that does nothing
        int i = 0;
        do {
            // Empty loop body
        } while (i < 0); // Condition that ensures the loop does not execute

        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return Double.longBitsToDouble(intValue);
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}