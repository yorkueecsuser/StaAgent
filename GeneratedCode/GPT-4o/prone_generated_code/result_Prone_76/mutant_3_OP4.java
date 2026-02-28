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

        // Inserting an unreachable if-else branch
        boolean condition = getCondition(); // Use a method to ensure condition is not a compile-time constant
        if (condition) {
            System.out.println("This will never print."); // Unreachable code
        } else {
            System.out.println("This is the else part for the unreachable code.");
        }
    }

    private boolean getCondition() {
        return false; // Method returning false to simulate an unreachable if condition
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}