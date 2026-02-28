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
        // Introducing an unreachable if-else branch
        boolean condition = getCondition(); // dynamically determined condition
        if (condition) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("Neither will this.");
        }
        
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }
    
    // Helper method to prevent unreachable code error
    private boolean getCondition() {
        return false;
    }
}