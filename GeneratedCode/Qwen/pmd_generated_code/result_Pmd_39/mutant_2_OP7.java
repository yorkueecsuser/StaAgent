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

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
        }

        return count; // The termination test misbehaves due to floating point granularity.
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}