class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Original buggy line
        boolean buggyLine = (e & A | B) == C; // Should be (e & (A | B)) == C

        // Added mutant: Unreachable switch statement
        int unreachableCondition = 0;
        switch(unreachableCondition) {
            case 1:
                System.out.println("This line is unreachable");
                break;
            default:
                break;
        }

        return buggyLine;
    }
}