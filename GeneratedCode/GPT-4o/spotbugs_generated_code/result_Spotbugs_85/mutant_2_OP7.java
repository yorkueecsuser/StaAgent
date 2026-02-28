class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        // Unreachable while loop mutation
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This is an unreachable block");
        }
        
        return compareMasks(value, mask1, mask2);
    }
    
    // Method to ensure that unreachableCondition is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
}