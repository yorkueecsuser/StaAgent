class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) {
            // Duplicated statement
            i += 0.1f;
            sum++;
        }
        return sum;
    }
}