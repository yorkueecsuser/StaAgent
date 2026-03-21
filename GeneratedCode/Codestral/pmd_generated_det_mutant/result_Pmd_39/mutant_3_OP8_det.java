class FloatLoopIndexBug {
    public static int showBug() {
        final int sktuuvbq = 2000000000;
        int fxoyyogh = 0;
        for (float f = sktuuvbq; f < sktuuvbq + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            fxoyyogh++;
        return fxoyyogh;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}