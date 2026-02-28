class FloatingLoopsAsCounters {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // Original bug: FL: Floating-point variables as loop counters
            if (getFalseCondition()) { // Mutated code: Unreachable if-else statement
                // This block is unreachable
                System.out.println("Unreachable block.");
            } else {
                sum++;
            }
        }
        return sum;
    }
}