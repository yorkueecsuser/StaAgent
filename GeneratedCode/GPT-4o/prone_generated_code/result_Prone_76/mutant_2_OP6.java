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
        
        // Mutation: Add an unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This is unreachable code.");
        }
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }

    // Method to ensure the condition is not a compile-time constant
    public boolean getFalseCondition() {
        return false;
    }
}