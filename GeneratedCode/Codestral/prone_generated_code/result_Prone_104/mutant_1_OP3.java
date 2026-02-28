class MathRoundIntLongBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(long number) {
        boolean condition = getUnreachableCondition();
        if (condition) {
            // Unreachable if statement
            System.out.println("This line should never be executed");
        }

        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    }
}