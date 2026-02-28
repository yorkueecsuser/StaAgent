class SuspiciousReferenceComparison {
    private boolean getFalseCondition() {
        // Dynamically return false for unreachable switch statement
        return false;
    }

    public boolean showBug(Integer a, Integer b) {
        // Original code
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        boolean result = a == b;

        // Mutant code
        // Unreachable switch statement
        boolean unreachableCondition = getFalseCondition();
        switch(unreachableCondition) {
            case true:
                // This code is unreachable
                System.out.println("This line should never execute.");
                break;
        }

        return result;
    }
}