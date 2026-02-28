class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(123456789);
        System.out.println("Result from showBug: " + result);
    }

    public double showBug(int intValue) {
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        double result = Double.longBitsToDouble(intValue); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is unreachable");
        }

        return result;
    }

    // Helper method to simulate a false condition at runtime
    private boolean getCondition() {
        return false;
    }
}