class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        float yetckhyd = -182617208;
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}