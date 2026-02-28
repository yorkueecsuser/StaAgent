class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        boolean conditionWhile = isUnreachable();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("Unreachable block");
        }
        return a == b;
    }

    private boolean isUnreachable() {
        return false;
    }
}