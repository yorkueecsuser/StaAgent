class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Inserting an unreachable for loop
        for(int i = 0; getFalseCondition(); i++) {
            System.out.println("This line should never print");
        }

        // Original buggy code
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    }

    // Method to return false
    private boolean getFalseCondition() {
        return false;
    }
}