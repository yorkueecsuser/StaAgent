class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Original bug: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        boolean originalBug = a == b;

        // Mutation: Unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            System.out.println("This loop is unreachable.");
        }

        return originalBug;
    }

    // Dummy method to avoid compile-time errors
    private boolean getCondition() {
        return false;
    }
}