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
        boolean condition = getCondition(); // Non-final variable to ensure it's evaluated at runtime
        if (condition) {
            System.out.println("This will never be printed.");
        }
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }
    
    // Helper method to ensure the condition is evaluated at runtime
    private boolean getCondition() {
        return false; // Always returns false, making the if-statement unreachable
    }
}