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
        // Introduce an unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch(unreachableCondition) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                break;
        }
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }

    // This method always returns a value that makes the switch statement unreachable
    private int getUnreachableCondition() {
        return 0; // This ensures that the switch cases are never reached
    }
}