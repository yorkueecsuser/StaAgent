class NonNegativeComparisonBug {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            while (getFalseCondition()) { // Mutant code: Unreachable while loop inserted here
                System.out.println("This line should never execute due to the unreachable while loop");
            }
            if (nonNegativeValue < negativeConstant) { // Original bug remains: INT: Bad comparison of nonnegative value with negative constant or zero
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}