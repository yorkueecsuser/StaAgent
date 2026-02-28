class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
        
        // Mutation: Inserting an unreachable if-else statement
        boolean isAlwaysFalse = getFalseCondition();
        if (isAlwaysFalse) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable mutation added.");
        }
    }

    // Helper method to ensure the condition isn't a compile-time constant
    public static boolean getFalseCondition() {
        return false;
    }
}