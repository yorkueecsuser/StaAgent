class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        { float i = 0.0f; do { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++; i += 0.1f; } while (i < limit); }
        return sum;
    }
}