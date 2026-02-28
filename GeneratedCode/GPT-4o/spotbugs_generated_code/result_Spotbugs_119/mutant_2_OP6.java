class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();

        // Unreachable for loop using a dynamic condition
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }

        double result = bugDemo.showBug(123456789);
        System.out.println("Result from showBug: " + result);
    }

    public double showBug(int intValue) {
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        double result = Double.longBitsToDouble(intValue); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    }

    // Method to determine the condition for the unreachable loop
    private static boolean getCondition() {
        return false; // Dynamically determined at runtime
    }
}