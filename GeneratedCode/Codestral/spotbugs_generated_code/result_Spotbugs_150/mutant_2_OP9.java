class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        float i = 0.0f;
        do {
            sum++;
            i += 0.1f;
        } while (i < limit); // Equivalent Loop Replacement - replaced for loop with do-while loop
        return sum;
    }
}