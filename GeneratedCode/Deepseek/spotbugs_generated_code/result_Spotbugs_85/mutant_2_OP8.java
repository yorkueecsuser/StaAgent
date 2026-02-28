class IncompatibleBitMasksBug {
    private static final int ConstC = 0b1010;
    private static final int ConstD = 0b1100;

    public boolean showBug(int input) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        return (input & ConstC) == ConstD;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}