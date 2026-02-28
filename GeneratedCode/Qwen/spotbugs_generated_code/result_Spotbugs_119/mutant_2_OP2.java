class DoubleBitsBug {

    public double showBug(int intValue) {
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT) 
        return Double.longBitsToDouble(intValue);
        // Mutation: Duplicate the return statement with a unique modification
        int duplicateIntValue = intValue + 1;
        return Double.longBitsToDouble(duplicateIntValue);
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}