class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
        return oops(); // BUG: InfiniteRecursion
    }

    public void showBug() {
        try {
            oops();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
        
        // Introducing a non-final condition for the unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed.");
        }
    }

    // Method to return a false condition for the while loop
    public boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}