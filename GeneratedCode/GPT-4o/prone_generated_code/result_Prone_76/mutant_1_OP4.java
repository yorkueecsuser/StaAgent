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
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This else branch is also unreachable.");
        }
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}