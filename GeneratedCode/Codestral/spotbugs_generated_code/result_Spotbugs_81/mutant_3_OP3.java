class NonNegativeComparisonBug {

    public boolean getCondition() {
        return false;
    }

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) {
                return -1;
            } else {
                return 1;
            }
            // Mutant code: Unreachable if statement
            if (getCondition()) {
                System.out.println("This line should never be executed.");
            }
        } else {
            return 0;
        }
    }
}