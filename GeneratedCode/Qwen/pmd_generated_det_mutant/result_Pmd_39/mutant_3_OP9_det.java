class Count {
    public static void main(String[] args) {
        Count countInstance = new Count();
        int result = countInstance.showBug();
        System.out.println(result); // Expected to print 0 due to the bug
    }

    public int showBug() {
        final int START = 2000000000;
        int count = 0;
        { float f = START; do { // BUG: DontUseFloatTypeForLoopIndices
            count++; f++; } while (f < START + 50); }
        return count; // The termination test misbehaves due to floating point granularity.
    }
}