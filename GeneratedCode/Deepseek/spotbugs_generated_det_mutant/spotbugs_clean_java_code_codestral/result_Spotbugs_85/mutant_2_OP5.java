class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // Original bug: BIT: Incompatible bit masks (BIT_AND)
        boolean result = (e & C) == D;

        // Mutant: Unreachable switch statement
        boolean isFalse = getFalseCondition();
        if (isFalse) {
            switch (getRandomValue()) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    private boolean getFalseCondition() {
        return false;
    }

    private int getRandomValue() {
        return 0;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}