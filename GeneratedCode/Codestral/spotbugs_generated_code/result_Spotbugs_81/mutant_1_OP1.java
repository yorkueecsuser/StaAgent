import java.util.Random;

class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;

            // Mutant code start (Dead Store)
            Random random = new Random();
            int deadStoreVariable = random.nextInt(100); // Unused variable
            // Mutant code end

            if (nonNegativeValue < negativeConstant) { // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}