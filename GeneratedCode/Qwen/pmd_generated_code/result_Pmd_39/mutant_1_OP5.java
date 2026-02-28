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

        // Introduced unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                count += 10; // This will never be executed
                break;
        }

        return count; // The termination test misbehaves due to floating point granularity.
    }

    private boolean getAlwaysFalse() {
        return false;
    }
}