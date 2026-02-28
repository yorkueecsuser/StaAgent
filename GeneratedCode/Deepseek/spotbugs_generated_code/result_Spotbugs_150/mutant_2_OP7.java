class FloatingLoopsAsCounters {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) {
            sum++;
            // Inserted unreachable while loop
            while (getFalseCondition()) {
                // This code is unreachable
                System.out.println("This is an unreachable loop.");
            }
        }
        return sum;
    }
}