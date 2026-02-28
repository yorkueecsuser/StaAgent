class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) { // Original comparison
                return -1;
            }
            if (nonNegativeValue < negativeConstant) { // Mutant: Duplicated comparison
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}