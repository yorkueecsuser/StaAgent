class FloatingLoopsAsCounters {
    public int showBug(float limit) {
        int sum = 0;
        for (float i = 0.0f; i < limit; i += 0.1f) { // Original bug: FL_FLOATS_AS_LOOP_COUNTERS

            // Added mutant code: Unreachable switch statement
            boolean shouldRun = false;
            switch (shouldRun? 1 : 2) {
                case 1:
                    // This case is unreachable because shouldRun is always false
                    int unreachable = 0;
                    break;
                default:
                    // This is the only reachable case
                    break;
            }

            sum++;
        }
        return sum;
    }
}