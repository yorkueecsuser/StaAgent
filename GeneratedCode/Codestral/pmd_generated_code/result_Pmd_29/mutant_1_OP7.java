class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        boolean conditionWhile = isConditionFalse();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable code block");
        }

        // Original code
        return value == Double.NaN;
    }

    private boolean isConditionFalse() {
        return false;
    }
}