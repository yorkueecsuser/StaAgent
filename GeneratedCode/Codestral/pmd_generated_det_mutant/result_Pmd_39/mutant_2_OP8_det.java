class FloatLoopIndexBug {
    public static int showBug() {
        final int szlhhitx = 2000000000;
        int keumuloe = 0;
        for (float f = szlhhitx; f < szlhhitx + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            keumuloe++;
        return keumuloe;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}