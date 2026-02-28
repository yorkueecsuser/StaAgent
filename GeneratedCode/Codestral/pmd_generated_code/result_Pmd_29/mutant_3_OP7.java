class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // Original code
        return value == Double.NaN;

        // Mutant code: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This code will never be executed.");
        }
    }
}