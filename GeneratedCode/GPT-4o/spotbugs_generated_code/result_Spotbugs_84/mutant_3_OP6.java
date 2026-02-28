class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        // Inserted unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }

        boolean result = checkBitwiseOperation(val, constant);
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    private boolean getCondition() {
        return false; // Condition is always false to ensure the loop is unreachable
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}