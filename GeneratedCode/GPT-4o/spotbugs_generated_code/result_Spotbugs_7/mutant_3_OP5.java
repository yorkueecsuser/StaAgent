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
        // Original recursive method with the bug
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
        }
        return recursiveMethod();
    }

    // A method used to dynamically determine the switch value at runtime
    public int getUnreachableValue() {
        return 0; // Ensures the switch statement is never true
    }
}