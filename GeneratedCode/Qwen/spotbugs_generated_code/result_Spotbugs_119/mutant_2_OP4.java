class DoubleBitsBug {

    public double showBug(int intValue) {
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable block.");
        }
        return Double.longBitsToDouble(intValue);
    }

    private boolean getCondition() {
        // Always returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}