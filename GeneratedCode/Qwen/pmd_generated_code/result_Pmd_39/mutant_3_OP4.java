class Count {
    public static void main(String[] args) {
        Count countInstance = new Count();
        int result = countInstance.showBug();
        System.out.println(result); // Expected to print 0 due to the bug
    }

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;

        // Introduced an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            count += 100;
        } else {
            // This block should also never execute
            count -= 50;
        }

        return count; // The termination test misbehaves due to floating point granularity.
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}