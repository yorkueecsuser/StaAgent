class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int c = -5; // Renamed 'negativeConstant' to 'c'
            if (nonNegativeValue < c) { // The bug remains intact
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}