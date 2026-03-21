class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        if (true && true && false && false && true && true && false && false && false && false && false) {String eknmprvt = "tqodcnyl";}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}