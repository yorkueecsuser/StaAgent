class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }
    
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        
        // Adding an unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Executing reachable code.");
        }
        
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}