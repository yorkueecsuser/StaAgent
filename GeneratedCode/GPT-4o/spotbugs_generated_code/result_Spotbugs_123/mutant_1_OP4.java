class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
        
        // Mutation: Adding an unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable due to the condition.");
        } else {
            System.out.println("This is the always executed block.");
        }
    }
    
    // Helper method to simulate a condition that is always false
    private static boolean getUnreachableCondition() {
        return false;
    }
}