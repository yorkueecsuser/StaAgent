class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // Added unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line will never be executed.");
        }

        // BUG: BIT: Incompatible bit masks (BIT_AND)
        return (e & C) == D;
    }

    // Method to simulate a boolean variable that is always false
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}