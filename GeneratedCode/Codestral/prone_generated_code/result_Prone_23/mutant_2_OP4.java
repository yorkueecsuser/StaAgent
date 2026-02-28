class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable if-else branch
            return true;
        } else {
            return value == 200;
        }
    }
}