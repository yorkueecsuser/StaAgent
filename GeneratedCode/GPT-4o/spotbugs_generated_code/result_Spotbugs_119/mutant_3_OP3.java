class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(123456789);
        System.out.println("Result from showBug: " + result);

        // Introducing an unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This message will never be printed.");
        }
    }

    public double showBug(int intValue) {
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        double result = Double.longBitsToDouble(intValue); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    }

    // Method to return a false condition to ensure unreachable code
    private static boolean getFalseCondition() {
        return false;
    }
}