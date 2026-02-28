class DoubleBitsBug {

    public double showBug(int intValue) {
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        int i = 0;
        do {
            // This loop does nothing meaningful but adheres to the mutation operator's requirements
            i++;
        } while (i < 1); // Ensures the loop runs exactly once and does not affect the original logic

        return Double.longBitsToDouble(intValue);
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}