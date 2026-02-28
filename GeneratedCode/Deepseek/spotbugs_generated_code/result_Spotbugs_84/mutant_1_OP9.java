class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    public boolean showBug(int val) {
        // Original buggy statement
        return ((val & CONSTANT) > 0);
    }

    public boolean showMutant(int val) {
        // Mutant statement based on "Equivalent Loop Replacement" operator description
        return ((val & CONSTANT) < 0);
    }
}