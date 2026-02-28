class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int e) {
        // Inserting unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable
        }
        return (e & C) == D;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}