class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        boolean condition = getCondition(); // Introduce a dynamic condition
        if (condition) {
            // Unreachable if-else branch
            if (false) {
                System.out.println("This branch is unreachable");
            } else {
                System.out.println("This branch is also unreachable");
            }
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        boolean condition = getCondition(); // Introduce a dynamic condition
        if (condition) {
            // Unreachable if-else branch
            if (false) {
                System.out.println("This branch is unreachable");
            } else {
                System.out.println("This branch is also unreachable");
            }
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}