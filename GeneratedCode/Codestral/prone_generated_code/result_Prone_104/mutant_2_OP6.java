class MathRoundIntLongBug {

    public int showBug(long number) {
        boolean shouldRun = getCondition();
        // Inserted unreachable for loop
        for (int i = 0; shouldRun; i++) {
            // This loop will not execute as the condition is always false
        }

        // BUG: MathRoundIntLong - Math.round() is called with a long type
        return Math.round(number);
    }

    // Created a method to return false dynamically
    private boolean getCondition() {
        return false;
    }
}