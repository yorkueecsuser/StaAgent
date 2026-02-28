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
        // Mutant: Unreachable for loop added
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable.");
        }
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }

    // Dummy method to ensure the loop condition is never true
    private boolean getCondition() {
        return false;
    }
}