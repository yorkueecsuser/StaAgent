class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);

        // Mutation: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
    }

    // Helper method to ensure the unreachable condition is not a compile-time constant
    private static boolean getUnreachableCondition() {
        return false;
    }
}