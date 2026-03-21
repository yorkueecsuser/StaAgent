class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float j = 0.0f; j < limit; j += 0.1f) { // Mutant code: Renamed loop counter from 'i' to 'j'
            sum++;
        }
        return sum;
    }
}