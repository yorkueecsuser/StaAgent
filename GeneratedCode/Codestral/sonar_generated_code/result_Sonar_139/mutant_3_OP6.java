class DoubleBug {
    public double showBug(int value) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop
            // This loop will never execute because the condition is always false
        }
        return Double.longBitsToDouble((long)value); // Noncompliant, corrected as per the original bug description
    }

    private boolean getCondition() {
        return false; // Method always returns false to ensure loop is unreachable
    }
}