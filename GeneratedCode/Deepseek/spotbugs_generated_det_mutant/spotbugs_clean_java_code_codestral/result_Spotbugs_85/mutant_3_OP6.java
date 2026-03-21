class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        for (int i = 0; getCondition(); i++) { // Unreachable for loop
            // This loop will never be executed since getCondition() always returns false
        }
        return (e & C) == D;
    }

    public static boolean getCondition() {
        return false; // Dynamic condition to ensure unreachability
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}