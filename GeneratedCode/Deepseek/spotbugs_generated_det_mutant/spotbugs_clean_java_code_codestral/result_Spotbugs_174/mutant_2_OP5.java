class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                throw new IllegalStateException("Unreachable code executed");
        }
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    private static int getUnreachableValue() {
        return 0; // Always returns a value that is not 1
    }

    // Remaining code remains the same
}