class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        // Original bug
        if ((e & C) == D) {
            return true;
        }

        // Mutated code with unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable");
                break;
            default:
                break;
        }
        return false;
    }

    private static int getUnreachableValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}