class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        boolean unreachableCondition = false; // Avoiding the direct use of 'false'
        if (unreachableCondition) {
            System.out.println("This statement is unreachable");
        }
        return a == b;
    }
}