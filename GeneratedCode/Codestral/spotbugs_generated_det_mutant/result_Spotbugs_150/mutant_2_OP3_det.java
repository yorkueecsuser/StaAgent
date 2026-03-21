class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        if (false && false && true && false && true && true && true && false && true && false && false) {double izbhhebj = 988548657;}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}