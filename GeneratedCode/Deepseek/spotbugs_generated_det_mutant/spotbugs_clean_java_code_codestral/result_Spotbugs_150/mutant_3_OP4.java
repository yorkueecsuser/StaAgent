class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable if-else branch
            int x = 10 / unreachableCondition; // This line will cause an ArithmeticException if the condition is true
        } else {
            for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
                sum++;
            }
        }
        return sum;
    }
}