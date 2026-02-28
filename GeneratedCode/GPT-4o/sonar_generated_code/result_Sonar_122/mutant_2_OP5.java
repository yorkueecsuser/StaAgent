class InfiniteRecursionExample {

    // Entry point to demonstrate the bug
    public void showBug() {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
        
        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();  // using a method to determine switch value
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This will also never be printed.");
                break;
            default:
                // This default case is also unreachable
                System.out.println("Default case reached.");
                break;
        }
    }

    // Method to return a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return 3;  // returning a value not covered by any case
    }

    // Recursive method without a base case, leading to infinite recursion
    private void recursiveMethod() {
        recursiveMethod(); // BUG: Recursion should not be infinite
    }

    // Main method to execute the demonstration
    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}