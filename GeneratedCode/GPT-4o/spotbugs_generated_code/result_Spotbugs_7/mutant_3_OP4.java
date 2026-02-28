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
        boolean condition = false; // Using a non-final variable to avoid unreachable statement error
        if (condition) {
            return -1; // This block is unreachable due to the condition being false
        } else {
            return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        }
    }

    public int showBug() {
        return recursiveMethod();
    }
}