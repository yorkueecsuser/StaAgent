class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Original buggy code
        boolean originalComparison = a == b;

        // Mutant code: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
            System.out.println("This statement should never be executed.");
        }

        return originalComparison;
    }

    // Method for dynamic condition (avoids compile-time constant)
    private boolean getCondition() {
        return false;
    }
}