class IncompatibleBitMasksBug {
    public boolean showBug(int e, int A, int B, int C) {
        // Original buggy code
        if ((e & A | B) == C) {
            // Insert unreachable while loop
            boolean unreachableCondition = false;
            while (unreachableCondition) {
                // This loop is unreachable
                System.out.println("This line should never be executed");
            }
            return true;
        }
        return false;
    }
}