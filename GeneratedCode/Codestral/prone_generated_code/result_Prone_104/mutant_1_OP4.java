class MathRoundIntLongBug {
    private boolean getUnreachableCondition() {
        // Returning a false value dynamically for the unreachable branch.
        return false;
    }

    public int showBug(long number) {
        if (getUnreachableCondition()) {
            // Unreachable branch
            return -1;
        } else {
            // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
            return Math.round(number);
        }
    }
}