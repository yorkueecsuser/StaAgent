class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        
        // Insert unreachable for loop
        boolean conditionFor = getCondition(); // Ensures the condition is non-final and dynamic
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This for loop is unreachable");
        }
        
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    private boolean getCondition() {
        return false; // Method to provide a condition value, ensuring dynamic runtime determination
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}