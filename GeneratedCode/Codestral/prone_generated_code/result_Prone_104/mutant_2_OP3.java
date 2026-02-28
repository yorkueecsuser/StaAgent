class MathRoundIntLongBug {

    private boolean getFalseCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public int showBug(long number) {
        if (getFalseCondition()) {
            // Unreachable code
            throw new RuntimeException("This code should never be executed");
        }
        // Original code
        return Math.round(number);
    }
}