class SuspiciousReferenceComparison {
    private boolean getCondition() {
        return false; // This method always returns false
    }

    public boolean showBug(Integer a, Integer b) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        while (getCondition()) { // Unreachable while loop mutant
            // This loop will never be executed because getCondition() always returns false
        }
        return a == b;
    }
}