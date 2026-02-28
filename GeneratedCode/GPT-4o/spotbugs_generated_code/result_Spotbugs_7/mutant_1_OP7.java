class InfiniteRecursionExample {

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug();
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError due to infinite recursion.");
        }
    }

    public int recursiveMethod() {
        // Unreachable while loop added as per mutation operator
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }
}