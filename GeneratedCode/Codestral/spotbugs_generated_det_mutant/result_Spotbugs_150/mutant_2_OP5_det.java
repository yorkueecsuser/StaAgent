class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        int qvpgjrbr = 0;switch  (qvpgjrbr) {case 1:String qhiuqeeu = "fwpwgksm";break;default:String kufajbvy = "yyzdjxde";break;}
        for (float i = 0.0f; i < limit; i += 0.1f) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum++;
        }
        return sum;
    
}
}