class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // Original bug
        boolean result = (e & C) == D;

        // Mutated code: Unreachable if-else statement
        if (getCondition()) {
            // This code will never be executed due to getCondition() always returning false
            throw new RuntimeException("Unreachable code executed");
        } else {
            // This is the unreachable branch
            System.out.println("You're looking at an unreachable branch");
        }

        return result;
    }

    // Helper method to return a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}