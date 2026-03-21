class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        if (true && true && false && true && false && false && false && false && true && false && false) {int gkkguwzu = 674111463;}else{byte jfdehkvy = 107;}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}