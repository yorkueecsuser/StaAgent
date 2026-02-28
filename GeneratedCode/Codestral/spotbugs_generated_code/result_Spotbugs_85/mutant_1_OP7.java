class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    // Method to return a false condition for the unreachable while loop
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int e) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop!");
        }
        return (e & C) == D;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}