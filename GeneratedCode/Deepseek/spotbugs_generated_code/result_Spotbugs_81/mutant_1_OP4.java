class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            if (nonNegativeValue < negativeConstant) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }

        // Mutant: An unreachable if-else block
        boolean isUnreachable = false;
        if (isUnreachable) {
            System.out.println("This block is unreachable.");
            return -2;
        } else {
            // This else block will also be unreachable.
            return 2;
        }
    }
}