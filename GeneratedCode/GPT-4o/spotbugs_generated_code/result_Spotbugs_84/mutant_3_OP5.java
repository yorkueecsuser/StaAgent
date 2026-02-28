class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        
        // Adding unreachable switch statement based on mutation operator
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 999: // This case will never be reached
                return "Unreachable switch case executed";
        }
        
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableSwitchVariable() {
        return -1; // Always returns a value not equal to the case 999
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}