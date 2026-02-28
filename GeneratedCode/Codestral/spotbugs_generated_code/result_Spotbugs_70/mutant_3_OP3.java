class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        boolean unreachableCondition = alwaysFalse();
        if (unreachableCondition) {
            System.out.println("This line should never be executed");
        }
        return a == b;
    }

    private boolean alwaysFalse() {
        return false;
    }
}