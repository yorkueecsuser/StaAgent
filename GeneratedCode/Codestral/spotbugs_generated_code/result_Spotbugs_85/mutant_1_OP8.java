class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;
    private static final int eRenamed = 0b0000; // The new variable name

    public boolean showBug(int e) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        return (e & C) == D;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
        System.out.println(bug.showBug(bug.eRenamed)); // Added this line to use the renamed variable
    }
}