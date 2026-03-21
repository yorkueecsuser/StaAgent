class FloatLoopIndexBug {
    public static int showBug() {
        final int aytvvlnb = 2000000000;
        int jhohbrim = 0;
        for (float f = aytvvlnb; f < aytvvlnb + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            jhohbrim++;
        return jhohbrim;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}