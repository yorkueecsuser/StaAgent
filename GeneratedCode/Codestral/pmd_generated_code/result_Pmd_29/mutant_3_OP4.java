class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original code
        boolean originalResult = (value == Double.NaN);

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should never execute");
        } else {
            System.out.println("This is the reachable part of the code");
        }

        return originalResult;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the condition unreachable
        return false;
    }
}