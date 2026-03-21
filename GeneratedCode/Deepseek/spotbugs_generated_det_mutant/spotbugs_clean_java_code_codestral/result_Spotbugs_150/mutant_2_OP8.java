class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;
        }

        // Mutated code based on Renaming mutation operator
        float j = 0.0f;
        while (j < limit) {
            sum++;
            j += 0.1f;
        }

        return sum;
    }
}