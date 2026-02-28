class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int i = Integer.MIN_VALUE; // unreachable code
            sum++;
        }
        for (float i = 0.0f; i < limit; i += 0.1f) { // Original bug remains
            sum++;
        }
        return sum;
    }
}