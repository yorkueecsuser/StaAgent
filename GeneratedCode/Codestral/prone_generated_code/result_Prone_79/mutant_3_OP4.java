class InlineMeValidatorBug {

    @InlineMe
    public static int expensiveMethod(int n) {
        int result = 1;
        boolean unreachableCondition = isUnreachable(); // Add unreachable condition
        if (unreachableCondition) { // Unreachable if-else statement
            throw new IllegalStateException("Unreachable code executed");
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }

    private static boolean isUnreachable() {
        return false; // Always false to make it unreachable
    }

    // Rest of the code remains the same...
}