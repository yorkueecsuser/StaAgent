class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // BUG: BIT: Incompatible bit masks (BIT_IOR)
        return (e & A | B) == C; // Original bug

        // Mutation using Duplication Operator
        int temp = (e & A | B) == C; // duplicate the buggy line
        return temp == C; // introduce a new bug by comparing the duplicated line with C
    }
}