class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("This is unreachable code.");
        }
        return compareMasks(value, mask1, mask2);
    }

    // Helper method to provide a false condition for the unreachable while loop
    public boolean getCondition() {
        return false; // This ensures the while loop is never executed
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
}