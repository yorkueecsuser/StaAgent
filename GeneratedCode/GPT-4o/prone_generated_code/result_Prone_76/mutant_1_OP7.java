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
        
        // Unreachable while loop introduced
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This block is unreachable.");
        }
    }

    private boolean getCondition() {
        return false; // The condition is false, making the while loop unreachable
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}