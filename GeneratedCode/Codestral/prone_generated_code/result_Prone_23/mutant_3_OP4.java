class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        final boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code executed");
        } else {
            // BUG: ComparisonOutOfRange
            return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}