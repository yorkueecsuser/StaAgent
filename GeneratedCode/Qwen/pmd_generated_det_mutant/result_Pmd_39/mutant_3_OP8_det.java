class Count {
    public static void main(String[] args) {
        Count countInstance = new Count();
        int result = countInstance.showBug();
        System.out.println(result); // Expected to print 0 due to the bug
    }

    public int showBug() {
        final int ndvsetab = 2000000000;
        int mqypiwge = 0;
        for (float f = ndvsetab; f < ndvsetab + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            mqypiwge++;
        return mqypiwge; // The termination test misbehaves due to floating point granularity.
    }
}