class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // original bug
            sum++;
            i += 0.1f; // added mutant (duplication of i += 0.1f)
        }
        return sum;
    }
}