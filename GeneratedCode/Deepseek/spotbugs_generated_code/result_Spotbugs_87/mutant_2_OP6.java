class IncompatibleBitMasksBug {
    private static boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int e, int A, int B, int C) {
        // Inserted unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This loop is unreachable.");
        }

        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Should be (e & (A | B)) == C
    }
}