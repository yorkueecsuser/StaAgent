class NonNegativeComparisonBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) { // Original bug
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }

        // Unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            int x = 10 / 0; // This line will cause a division by zero error if the unreachable branch executed
        } else {
            return -2;
        }
    }
}