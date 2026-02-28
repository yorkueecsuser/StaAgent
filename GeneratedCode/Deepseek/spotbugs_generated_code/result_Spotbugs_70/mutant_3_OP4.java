class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Original code: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if-else statement
            if (false) {
                return a.equals(b); // Correct comparison using equals() method
            } else {
                System.out.println("Unreachable code block");
            }
        }
        return a == b;
    }

    private boolean getCondition() {
        // This method returns a dynamically generated condition to avoid compile-time errors
        return true;
    }
}