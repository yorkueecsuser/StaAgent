class DoubleBitsBug {

    public double showBug(int intValue) {
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return Double.longBitsToDouble(intValue);
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        int x = 123456789; // Renamed variable 'args' to 'x'
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(x));
    }
}