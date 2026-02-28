class BitMaskBugExample {

    public boolean compareMasks(int value, int mask1, int mask2) {
        // This line demonstrates the bug: BIT: Incompatible bit masks (BIT_AND)
        return (value & mask1) == mask2; // BUG: BIT: Incompatible bit masks (BIT_AND)
    }

    public boolean showBug(int value, int mask1, int mask2) {
        // Adding unreachable switch statement
        int unreachableSwitch = getUnreachableValue();
        switch(unreachableSwitch) {
            case 10: // This case is never reached
                System.out.println("This is unreachable.");
                break;
            default:
                // Default case does nothing
                break;
        }
        
        return compareMasks(value, mask1, mask2);
    }

    public static void main(String[] args) {
        BitMaskBugExample example = new BitMaskBugExample();
        
        // Example usage demonstrating the bug
        // For the inputs (5, 4, 2), the result will always be false due to incompatible masks
        boolean result = example.showBug(5, 4, 2);
        System.out.println("Result of comparison: " + result);
    }
    
    // This method returns a value that will never match the case in the switch statement
    private int getUnreachableValue() {
        return 0; // This value doesn't match any case in the switch
    }
}