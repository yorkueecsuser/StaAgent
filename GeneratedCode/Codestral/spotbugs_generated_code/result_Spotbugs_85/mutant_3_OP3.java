class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    // New method that always returns false
    private boolean isFalse() {
        return false;
    }

    public boolean showBug(int e) {
        // Unreachable if statement
        if (isFalse()) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
        return (e & C) == D;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}