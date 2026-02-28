class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        // Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        // Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }
    
    // Method to provide a condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}