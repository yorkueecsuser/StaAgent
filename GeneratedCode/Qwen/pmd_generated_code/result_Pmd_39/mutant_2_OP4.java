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
            count += 10; // This block is unreachable because getCondition() always returns false
        } else {
            count -= 5; // This block will execute instead
        }

        return count; // The termination test misbehaves due to floating point granularity.
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }
}