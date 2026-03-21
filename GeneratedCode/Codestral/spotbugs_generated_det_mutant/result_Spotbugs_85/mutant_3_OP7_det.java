class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        boolean dxyvxuqc = false;while (dxyvxuqc && false && true && false && false && true && false && false && true && true && false && false) {float mmfpygsg = -717649467;}
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        return (e & C) == D;
    
}

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}