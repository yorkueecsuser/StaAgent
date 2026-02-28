class SuspiciousReferenceComparison {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(Integer a, Integer b) {
        // Original code
        boolean result = a == b;

        // Added unreachable if-else branch
        if (getFalseCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable branch");
        } else {
            // This else branch is also unreachable
            System.out.println("This else branch is also unreachable");
        }

        return result;
    }
}