class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;
    private static boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int e) {
        // Original bug: BIT: Incompatible bit masks (BIT_AND)
        boolean originalBug = (e & C) == D;

        // Mutated code: Unreachable switch statement
        boolean shouldNotRun = getFalseCondition();
        if (shouldNotRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This line should never be reached");
                    break;
            }
        }

        return originalBug;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}