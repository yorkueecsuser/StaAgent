class InfiniteRecursionExample {

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug();
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError due to infinite recursion.");
        }
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // This method must ensure a value that doesn't match any case
        switch (unreachableValue) {
            case 1:
                System.out.println("Case 1.");
                break;
            case 2:
                System.out.println("Case 2.");
                break;
            default:
                System.out.println("Default case.");
                break;
        }      
    }

    public int recursiveMethod() {
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }

    // An example method that returns a value that will not match any switch case
    private static int getUnreachableValue() {
        return 3; // This value doesn't match any case in the switch statement above
    }
}