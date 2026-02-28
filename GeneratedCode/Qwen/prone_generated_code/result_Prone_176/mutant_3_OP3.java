class XorPowerBug {

    // Method to demonstrate the XorPower bug
    public int showBug(int base, int exponent) {
        // Using XOR operator instead of power operator
        return base ^ exponent; // BUG: XorPower

        // Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable because getUnreachableCondition() always returns false
            System.out.println("This message will never be printed.");
        }
    }

    // Method to provide a dynamically determined false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        XorPowerBug bugDemo = new XorPowerBug();
        int result = bugDemo.showBug(2, 2);
        System.out.println("Result of 2 ^ 2 using XOR: " + result); // Expected incorrect result due to bug
    }
}