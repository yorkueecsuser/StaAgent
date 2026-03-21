class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        if (true && false && true && true && true && false && true && false && false && true && false) {double wjgjjhvq = 221384400;}else{byte ycawcbrb = 122;}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}