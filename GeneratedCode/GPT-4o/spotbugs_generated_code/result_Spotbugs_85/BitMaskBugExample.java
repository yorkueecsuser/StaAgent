class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is unreachable
            System.out.println("Inside unreachable while loop");
        }
        return compareMasks(value, mask1, mask2);
    }

    private boolean getUnreachableCondition() {
        // This method provides a condition that is always false at runtime
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