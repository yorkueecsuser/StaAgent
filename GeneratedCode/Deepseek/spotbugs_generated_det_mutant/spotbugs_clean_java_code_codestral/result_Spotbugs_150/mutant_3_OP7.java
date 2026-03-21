class FloatingLoopsAsCounters {
    private boolean getUnreachableCondition() {
        return false; // Always returns false for the unreachable condition
    }

    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            // Unreachable while loop mutation
            while (getUnreachableCondition()) {
                // This code will never be executed
            }
            sum++;
        }
        return sum;
    }
}