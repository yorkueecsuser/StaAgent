class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        // Introduce a non-final variable to ensure the for loop is unreachable
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never be reached
            System.out.println("This is unreachable code inside the for loop.");
        }
        return compareMasks(value, mask1, mask2);
    }

    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
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