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

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            count += 10; // This block is unreachable because getCondition() always returns false
        }

        return count; // The termination test misbehaves due to floating point granularity.
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime but always returns false
    }
}