class NonNegativeComparisonBug {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) {
                return -1;
            } else {
                // Mutant code: Unreachable if statement
                if (getFalseCondition()) {
                    System.out.println("This code should never be executed.");
                }
                return 1;
            }
        } else {
            return 0;
        }
    }
}