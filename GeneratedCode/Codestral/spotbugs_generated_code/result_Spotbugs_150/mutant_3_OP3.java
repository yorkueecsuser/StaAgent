class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;
            if (getCondition()) { // Unreachable if statement (gets always false condition)
                // Unreachable code
                int x = 10 / 0; // This line will cause a division by zero error if the unreachable branch is executed
            }
        }
        return sum;
    }

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}