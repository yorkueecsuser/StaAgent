class BitwiseOperationBug {

    public int showBug(int val) {
        int CONSTANT = -16; // Example negative constant
        boolean result = ((val & CONSTANT) > 0); // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable case");
                break;
            default:
                // This default case will also never be executed because condition is always false
                System.out.println("This is also an unreachable case");
                break;
        }

        return result? 1 : 0;
    }

    private boolean getCondition() {
        // This method returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        BitwiseOperationBug bugDemo = new BitwiseOperationBug();
        System.out.println(bugDemo.showBug(16));  // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(-16)); // Expected to be 0 but might not be due to the bug
        System.out.println(bugDemo.showBug(32));  // Expected to be 0 but might not be due to the bug
    }
}