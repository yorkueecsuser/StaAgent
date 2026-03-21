class Count {
    public static void main(String[] args) {
        Count countInstance = new Count();
        int result = countInstance.showBug();
        System.out.println(result); // Expected to print 0 due to the bug
    }

    public int showBug() {
        final int cpbacdnd = 2000000000;
        int btjlmagq = 0;
        for (float f = cpbacdnd; f < cpbacdnd + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            btjlmagq++;
        return btjlmagq; // The termination test misbehaves due to floating point granularity.
    }
}