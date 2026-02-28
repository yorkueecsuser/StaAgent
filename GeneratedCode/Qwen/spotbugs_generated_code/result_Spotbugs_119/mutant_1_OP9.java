class DoubleBitsBug {

    public double showBug(int intValue) {
        // Added do-while loop that does not affect the functionality
        int i = 0;
        do {
            i++;
        } while (i < 1);

        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return Double.longBitsToDouble(intValue);
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}