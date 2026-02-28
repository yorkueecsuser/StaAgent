class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;
    private static final int E = 0b0110; // This is the new variable

    public boolean showBug(int f) { // This is the new variable
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        return (f & C) == D; // The variable 'e' is replaced with 'f'
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(E)); // The variable '0b0110' is replaced with 'E'
    }
}