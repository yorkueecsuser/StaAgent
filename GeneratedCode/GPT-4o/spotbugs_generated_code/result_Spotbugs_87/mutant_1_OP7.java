class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        boolean conditionWhile = getCondition(); // Unreachable while loop
        while (conditionWhile) {
            // This block is unreachable due to conditionWhile being always false
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        boolean conditionWhile = getCondition(); // Unreachable while loop
        while (conditionWhile) {
            // This block is unreachable due to conditionWhile being always false
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
    
    // Method to return false for the unreachable while loop condition
    private boolean getCondition() {
        return false;
    }
}