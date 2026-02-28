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

        // Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Neither will this.");
        }
    }

    // Method to provide a condition for the if-else statement
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}