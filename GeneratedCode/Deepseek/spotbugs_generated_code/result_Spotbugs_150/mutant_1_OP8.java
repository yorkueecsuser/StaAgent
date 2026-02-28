class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int t = 0;  // Mutated code: Renamed variable sum to t
        for (float i = 0.0f; i < limit; i += 0.1f) {
            t++;
        }
        return t;
    }
}