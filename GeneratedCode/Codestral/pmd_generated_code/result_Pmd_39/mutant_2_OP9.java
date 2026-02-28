class FloatLoopIndexBug {
    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        float f = START;
        do {
            count++;
            f++;
        } while (f < START + 50); // BUG: DontUseFloatTypeForLoopIndices
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}