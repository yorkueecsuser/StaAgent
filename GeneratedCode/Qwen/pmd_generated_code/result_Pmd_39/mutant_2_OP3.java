class Count {
    public static void main(String[] args) {
        Count countInstance = new Count();
        int result = countInstance.showBug();
        System.out.println(result); // Expected to print 0 due to the bug
    }

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        
        // Inserting an unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            count = -1; // This line is unreachable
        }

        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count; // The termination test misbehaves due to floating point granularity.
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }
}