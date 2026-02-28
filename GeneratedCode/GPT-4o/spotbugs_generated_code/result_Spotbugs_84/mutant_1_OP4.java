class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is never executed
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("This is the else block for demonstration purposes.");
        }
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    // Helper method to ensure the if condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}