class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        // Unreachable for loop mutant
        for (int i = 0; isUnreachable(); i++) {
            // This code is not executed
            int x = i + 1;
        }

        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    }

    // Method to return false for the unreachable loop
    private boolean isUnreachable() {
        return false;
    }
}