class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        boolean conditionWhile = isConditionFalse();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("This will never be printed.");
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        boolean conditionWhile = isConditionFalse();
        while (conditionWhile) {
            // This is an unreachable while loop
            System.out.println("This will never be printed.");
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}