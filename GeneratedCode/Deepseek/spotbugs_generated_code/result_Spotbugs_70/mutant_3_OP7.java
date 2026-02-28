class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Original bug
        boolean comparisonResult = a == b;

        // Added mutant code (unreachable while loop)
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }

        return comparisonResult;
    }

    // Helper method for unreachable condition
    private boolean getCondition() {
        return false;
    }
}