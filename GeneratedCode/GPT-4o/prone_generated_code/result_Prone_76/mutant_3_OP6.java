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
    }

    // Method to determine condition for unreachable loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();

        // Unreachable for loop insertion
        boolean conditionFor = example.getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable");
        }
    }
}