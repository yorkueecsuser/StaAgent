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

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile will always be false
            count--; // Just some arbitrary operation to ensure the loop body is not empty
        }

        return count; // The termination test misbehaves due to floating point granularity.
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }
}