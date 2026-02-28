class FloatLoopIndexBug {
    private static boolean getCondition() {
        return false;
    }

    public static int showBug() {
        final int START = 2000000000;
        int count = 0;

        // Mutant code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            int i = 0; // Dummy variable to avoid unreachable statement error
        }

        for (float f = START; f < START + 50; f++) // BUG: DontUseFloatTypeForLoopIndices
            count++;
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}