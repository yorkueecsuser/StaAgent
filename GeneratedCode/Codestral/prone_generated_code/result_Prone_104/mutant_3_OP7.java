class MathRoundIntLongBug {

    private boolean getCondition() {
        return false; // always returns false to make the loop unreachable
    }

    public int showBug(long number) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This line should never execute.");
        }

        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float.
        // This may result in truncation.
        return Math.round(number);
    }
}