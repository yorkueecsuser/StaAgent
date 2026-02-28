class BitMaskExample {

    private boolean alwaysFalse() {
        return false;
    }

    public boolean showBug(int e, int C, int D) {
        if (alwaysFalse()) {
            System.out.println("This code is unreachable");
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        if (alwaysFalse()) {
            System.out.println("Still unreachable code");
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}