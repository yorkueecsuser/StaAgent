class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }
    
    // Mutation Operator: Unreachable if statement
    private boolean getCondition() {
        return false; // This function always returns false
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        
        // Unreachable if statement
        if (example.getCondition()) {
            System.out.println("This code is unreachable.");
        }
        
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}