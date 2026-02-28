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
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable because the conditionWhile is always false
            System.out.println("This is an unreachable while loop.");
        }
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }
    
    // Method to ensure the condition is determined at runtime
    private boolean getCondition() {
        return false;
    }
}