class FloatingLoopsAsCounters {
    private boolean alwaysFalse() {
        return false;
    }

    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // Original bug remains
            sum++;
        }

        // Added unreachable for loop
        for (int j = 0; alwaysFalse(); j++) {
            sum--;
        }

        return sum;
    }
}