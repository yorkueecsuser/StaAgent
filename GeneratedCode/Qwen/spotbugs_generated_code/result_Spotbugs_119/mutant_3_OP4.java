class DoubleBitsBug {

    public double showBug(int intValue) {
        // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return Double.longBitsToDouble(intValue);

        // Mutated code with unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable
            System.out.println("This block is reachable.");
        } else {
            // This block is unreachable
            System.out.println("This block is unreachable.");
        }
    }

    private boolean getCondition() {
        // Always returns false to make the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Result of showBug with int value 123456789: " + bugDemo.showBug(123456789));
    }
}