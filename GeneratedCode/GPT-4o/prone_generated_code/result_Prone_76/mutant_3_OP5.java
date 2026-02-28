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
        
        // Inserting unreachable switch statement
        int switchCondition = getUnreachableSwitchCondition();
        switch (switchCondition) {
            case 1:
                System.out.println("This is unreachable code.");
                break;
            default:
                break; // Ensure default is breaking
        }
    }

    // Helper method to get a condition that makes switch statement unreachable
    private int getUnreachableSwitchCondition() {
        return 0; // This ensures the switch condition is always false
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}