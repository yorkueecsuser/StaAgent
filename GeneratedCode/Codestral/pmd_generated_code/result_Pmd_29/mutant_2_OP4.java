class ComparisonWithNaNBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        } else {
            // Original code
            return value == Double.NaN;
        }
    }
}