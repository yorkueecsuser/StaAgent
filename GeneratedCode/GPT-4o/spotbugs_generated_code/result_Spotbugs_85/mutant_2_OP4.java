class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        // Introduce an unreachable if-else statement
        if (getCondition()) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will always be printed.");
        }
        return compareMasks(value, mask1, mask2);
    }

    // Helper method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // This condition is always false, making the if-block above unreachable
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
}