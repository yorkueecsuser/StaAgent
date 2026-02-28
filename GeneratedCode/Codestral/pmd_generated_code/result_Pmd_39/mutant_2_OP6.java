class FloatLoopIndexBug {
    public static int showBug() {
        boolean unreachableCondition = getCondition(); // added: method call to dynamically determine the condition
        for (int i = 0; i < 1; i++) { // added: unreachable for loop
            if (unreachableCondition) {
                System.out.println("This should never be printed.");
            }
        }

        final int START = 2000000000;
        int count = 0;
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

    // added: method to dynamically determine the condition
    private static boolean getCondition() {
        return false; // always returns false to make the loop unreachable
    }
}