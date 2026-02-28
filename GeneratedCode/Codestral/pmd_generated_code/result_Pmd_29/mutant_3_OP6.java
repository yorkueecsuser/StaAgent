class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original code
        boolean originalResult = value == Double.NaN;

        // Mutant code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be executed.");
        }

        return originalResult;
    }

    private boolean getCondition() {
        // This method is used to generate a runtime condition for the for loop
        // In a real mutation scenario, this method would return a dynamically determined value
        return false;
    }
}