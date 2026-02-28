class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        return value == Double.NaN;
    }

    public void unreachableLoopMethod() {
        boolean loopCondition = getCondition();
        for (int i = 0; loopCondition; i++) {
            // This block of code should be unreachable, as loopCondition is always false.
            System.out.println("This line should never be printed.");
        }
    }

    private boolean getCondition() {
        // Always return false to make the loop unreachable.
        return false;
    }
}