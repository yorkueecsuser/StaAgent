class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        boolean jsxvrarc = false;while (jsxvrarc && false && false && true && true && true && false && false && true && false && true && false) {byte kwedeymh = -115;}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}