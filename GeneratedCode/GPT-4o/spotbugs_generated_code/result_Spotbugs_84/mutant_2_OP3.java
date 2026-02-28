class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean condition = computeCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        }
        
        boolean result = checkBitwiseOperation(val, constant);
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    private boolean computeCondition() {
        // This method returns false to ensure the 'if' condition is always false
        return false;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}