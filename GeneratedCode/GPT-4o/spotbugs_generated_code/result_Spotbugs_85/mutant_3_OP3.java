class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code block is unreachable due to the condition always being false
            System.out.println("This should never be printed");
        }
        return compareMasks(value, mask1, mask2);
    }

    // Method to simulate unreachable condition
    private boolean getUnreachableCondition() {
        return false; // Non-final variable used to ensure the condition is dynamically determined
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
}