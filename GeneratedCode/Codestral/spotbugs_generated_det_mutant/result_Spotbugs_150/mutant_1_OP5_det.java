class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        int pwmmvujf = 0;switch  (pwmmvujf) {case 1:byte uarhajcz = -68;break;default:double clbdyzne = -176698201;break;}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}