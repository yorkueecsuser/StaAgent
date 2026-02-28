class SuspiciousReferenceComparison {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(Integer a, Integer b) {
        if (getUnreachableCondition()) {
            System.out.println("This code will never be executed");
        }

        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    }
}