class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;
    private static boolean getCondition() {
        return false;
    }

    public boolean showBug(int e) {
        while (getCondition()) {
            // Added unreachable while loop based on the "Unreachable while loop" mutation operator
            System.out.println("Unreachable code");
        }
        return (e & C) == D;
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}