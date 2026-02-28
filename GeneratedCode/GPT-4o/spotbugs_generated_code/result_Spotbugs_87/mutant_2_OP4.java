class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable code block.");
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is another unreachable code block.");
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the condition unreachable
        return false;
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}