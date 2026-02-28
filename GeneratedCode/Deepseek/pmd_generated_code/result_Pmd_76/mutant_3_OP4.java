class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // Mutation-1: Unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Do nothing, this is the mutated part
        } else {
            System.out.println("This is an unreachable branch.");
        }
    }

    // Mutation-2: Insert non-final variable
    public static boolean getCondition() {
        boolean condition = true; // mutation to avoid compile-time constant as condition
        return condition;
    }
}