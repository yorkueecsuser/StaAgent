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
        
        // Dead Store Mutation
        int abcdefgh = 42; // This is a dead store as the variable is declared but never used
        
        return count; // The termination test misbehaves due to floating point granularity.
    }
}