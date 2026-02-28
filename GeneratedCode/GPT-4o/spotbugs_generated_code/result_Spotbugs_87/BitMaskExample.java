class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition(); // This will always be false
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition(); // This will always be false
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    // Helper method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}