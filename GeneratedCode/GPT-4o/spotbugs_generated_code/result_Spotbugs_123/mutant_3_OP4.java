class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        // Original buggy code
        boolean result = obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
        
        // Unreachable if-else statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block will never execute
            System.out.println("Unreachable code executed");
        } else {
            // This block will always execute
            System.out.println("This is the reachable branch");
        }
        
        return result;
    }

    // Method to provide a condition for the unreachable if statement
    private boolean getUnreachableCondition() {
        // This returns false to keep the branch unreachable
        return false;
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}