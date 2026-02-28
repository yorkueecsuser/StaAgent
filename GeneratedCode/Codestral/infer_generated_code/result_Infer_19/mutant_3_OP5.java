class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int result = x + y;

        // Mutation: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed.");
                    break;
                default:
                    break;
            }
        }

        return result;
    }

    // Dummy method to avoid compile-time errors
    private static int getValue() {
        return 0;
    }
}