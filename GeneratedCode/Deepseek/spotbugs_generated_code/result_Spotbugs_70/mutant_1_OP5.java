class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        boolean unreachableCondition = a == b;
        if (!unreachableCondition) {
            int value = a.hashCode();  // This is just to ensure the condition is not a compile-time constant
            switch (value) {
                case 1:
                    System.out.println("This should never print.");
                    break;
                default:
                    break;
            }
        }
        return a == b;
    }
}