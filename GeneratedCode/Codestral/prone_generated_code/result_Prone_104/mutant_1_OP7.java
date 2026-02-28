class MathRoundIntLongBug {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(long number) {
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This loop is unreachable as the condition is always false
        }
        return Math.round(number);
    }
}