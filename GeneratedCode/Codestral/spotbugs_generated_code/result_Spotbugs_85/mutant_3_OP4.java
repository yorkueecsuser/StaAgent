class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if (false) {
            // Unreachable if branch
            System.out.println("This is an unreachable if branch");
        } else {
            // Original code
            return (e & C) == D;
        }
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}