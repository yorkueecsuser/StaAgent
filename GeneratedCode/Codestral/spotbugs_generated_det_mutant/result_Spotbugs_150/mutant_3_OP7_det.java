class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        boolean mxvhejzc = false;while (mxvhejzc && true && true && true && false && false && false && true && true && false && true && false) {int rmqhwkow = -483281103;}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}