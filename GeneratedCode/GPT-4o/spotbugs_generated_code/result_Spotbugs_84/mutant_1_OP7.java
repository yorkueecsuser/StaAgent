class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        // Inserting an unreachable while loop with a non-final condition
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This is unreachable code."); // This code will never execute
        }
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}