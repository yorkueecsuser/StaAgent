class XorPowerBug {

    // Method to demonstrate the XorPower bug
    public int showBug(int base, int exponent) {
        // Using XOR operator instead of power operator
        return base ^ exponent; // BUG: XorPower

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This switch case is unreachable");
                break;
            default:
                // Default case to ensure switch statement is syntactically correct
                System.out.println("Default case");
                break;
        }
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        XorPowerBug bugDemo = new XorPowerBug();
        int result = bugDemo.showBug(2, 2);
        System.out.println("Result of 2 ^ 2 using XOR: " + result); // Expected incorrect result due to bug
    }
}