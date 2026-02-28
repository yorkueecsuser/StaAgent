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
        
        // Mutation: Unreachable if statement with a dynamically determined condition
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }

    // Helper method to simulate a dynamic condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}