class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
        // Unreachable if branch added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed."); // Unreachable code due to condition always being false
        }
        return oops(); // BUG: InfiniteRecursion
    }

    private boolean getCondition() {
        // This method always returns false to simulate an unreachable if branch
        return false;
    }

    public void showBug() {
        try {
            oops();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}