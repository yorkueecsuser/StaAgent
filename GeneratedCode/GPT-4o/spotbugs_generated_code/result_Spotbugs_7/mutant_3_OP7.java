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
        boolean conditionWhile = getCondition(); // Using non-final variable for the condition
        while (conditionWhile) {
            // Unreachable while loop due to condition always being false
            System.out.println("This line is unreachable.");
        }
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }

    public boolean getCondition() {
        return false; // Non-final method returning false
    }
}