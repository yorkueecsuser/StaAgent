class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        // Insert an unreachable switch statement using a dynamically determined condition
        int unreachableSwitchCondition = getSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            default:
                System.out.println("Default case is also never reached.");
                break;
        }
        
        return compareMasks(value, mask1, mask2);
    }

    // Method to simulate a non-final variable or equivalent method call
    private int getSwitchCondition() {
        return 0; // This mimics a dynamically determined condition that makes the switch unreachable
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
}