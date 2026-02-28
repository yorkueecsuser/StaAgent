class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Original buggy code
        boolean buggyCode = (e & A | B) == C; // Should be (e & (A | B)) == C

        // Unreachable switch statement
        int unreachableValue = 0;
        switch (unreachableValue) {
            case 1:
                // This code will never be executed as the switch expression always evaluates to 0
                System.out.println("Unreachable switch statement executed");
                break;
            default:
                // This code will always be executed as there is no matching case
                break;
        }

        return buggyCode;
    }
}