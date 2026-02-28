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

        // Insert an unreachable switch statement
        int unreachableSwitchCondition = getSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
    }

    // Method to ensure the condition is non-final and evaluated at runtime
    private int getSwitchCondition() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}