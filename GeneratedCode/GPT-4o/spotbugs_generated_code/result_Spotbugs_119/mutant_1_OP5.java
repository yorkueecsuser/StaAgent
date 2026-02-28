class DoubleLongBitsBug {

    public static void main(String[] args) {
        DoubleLongBitsBug bugDemo = new DoubleLongBitsBug();
        double result = bugDemo.showBug(123456789);
        System.out.println("Result from showBug: " + result);
        
        // Introducing an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print.");
                break;
            default:
                // This default case will execute
                System.out.println("Default case executed but unreachable.");
        }
    }

    public double showBug(int intValue) {
        // This line demonstrates the bug by passing an int to Double.longBitsToDouble
        double result = Double.longBitsToDouble(intValue); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    }

    // Method to ensure switch statement is unreachable
    private static int getUnreachableValue() {
        return 2; // Ensures the switch in main is unreachable for the case 1
    }
}