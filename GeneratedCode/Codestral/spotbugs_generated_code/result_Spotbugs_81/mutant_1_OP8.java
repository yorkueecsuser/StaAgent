class NonNegativeComparisonBug {

    public int showBug(int nnv) {
        if (nnv >= 0) {
            int nc = -5;
            if (nnv < nc) { // Original bug remains intact
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public int showMutant(int nonNegativeValue) { // Mutant code
        int nc = -5;
        if (nonNegativeValue < nc) { // Unintended comparison
            return -2;
        } else {
            return 2;
        }
    }
}