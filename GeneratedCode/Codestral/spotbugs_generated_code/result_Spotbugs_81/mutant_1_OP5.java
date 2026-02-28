class NonNegativeComparisonBug {

    private boolean alwaysFalse() {
        return false;
    }

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) { // BUG: INT: Bad comparison of nonnegative value with negative constant or zero
                return -1;
            } else {
                // Mutant: Unreachable switch statement
                int value = nonNegativeValue;
                if (alwaysFalse()) {
                    switch(value) {
                        case 1:
                            // Unreachable code
                            return -2;
                        default:
                            break;
                    }
                }
                return 1;
            }
        } else {
            return 0;
        }
    }
}