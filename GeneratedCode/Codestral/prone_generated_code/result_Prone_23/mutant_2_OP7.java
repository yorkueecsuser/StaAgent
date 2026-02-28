class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This while loop is unreachable because the condition is always false
        }
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }

    private boolean getCondition() {
        // This method is added to provide a dynamic condition for the unreachable while loop
        return false;
    }
}