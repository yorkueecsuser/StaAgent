class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int insdejma = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            insdejma++;
        }
        return insdejma;
    }
}