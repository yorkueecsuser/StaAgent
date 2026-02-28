class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int e) {
        boolean shouldRun = getCondition();
        // Mutant code: Unreachable if-else statement
        if (shouldRun) {
            throw new RuntimeException("This part of the code is unreachable");
        } else {
            // Original bug remains
            return (e & C) == D;
        }
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}