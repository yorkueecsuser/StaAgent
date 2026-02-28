class ComparisonWithNaNBug {

    private boolean getFalseCondition() {
        // Always returns false to make the branch unreachable
        return false;
    }

    public boolean showBug(double value) {
        // Original code
        boolean originalResult = value == Double.NaN;

        // Inserted unreachable if-else branch
        if (getFalseCondition()) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the else block.");
        }

        return originalResult;
    }
}