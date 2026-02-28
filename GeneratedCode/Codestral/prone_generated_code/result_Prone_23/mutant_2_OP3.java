class ComparisonOutOfRangeBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(byte value) {
        // Original code
        boolean result = value == 200;

        // Mutant code: Unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line should be unreachable.");
        }

        return result;
    }
}