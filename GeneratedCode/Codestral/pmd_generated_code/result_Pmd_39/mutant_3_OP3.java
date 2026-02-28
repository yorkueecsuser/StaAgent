class FloatLoopIndexBug {
    private static boolean getUnreachableCondition() {
        return false; // This method always returns false to make the if statement unreachable
    }

    public static int showBug() {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++) { // BUG: DontUseFloatTypeForLoopIndices
            count++;
            if (getUnreachableCondition()) { // Unreachable if statement mutation operator applied here
                System.out.println("This line will never be executed");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = showBug();
        // Prints 0 because (float) START == (float) (START + 50).
        // The termination test misbehaves due to floating point granularity.
        System.out.println(result);
    }
}