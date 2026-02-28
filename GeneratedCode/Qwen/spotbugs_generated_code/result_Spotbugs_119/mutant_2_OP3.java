class DoubleBitsBug {

    public double showBug(int intValue) {
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT) 
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement because getCondition() will never return true
            System.out.println("This will never be printed");
        }
        return Double.longBitsToDouble(intValue);
    }

    private boolean getCondition() {
        // This method always returns false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}