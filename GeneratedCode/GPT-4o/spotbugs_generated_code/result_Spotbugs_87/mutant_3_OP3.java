class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        boolean condition = getFalseCondition(); // Method call to ensure condition is false at runtime
        if (condition) {
            // Unreachable code due to the condition being false
            System.out.println("This block is unreachable");
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        boolean condition = getFalseCondition(); // Method call to ensure condition is false at runtime
        if (condition) {
            // Unreachable code due to the condition being false
            System.out.println("This block is unreachable");
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    private boolean getFalseCondition() {
        return false; // Method ensures the condition is false
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();

        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}