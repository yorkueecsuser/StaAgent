class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int e) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if (getCondition()) {
            // MUTANT: Unreachable if statement
            return (e & C) == D;
        }
        return false;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}