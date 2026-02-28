class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        // Original bug: this instanceof test will always return false
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);

        // Inserting an unreachable for loop
        int unreachableCondition = getUnreachableCondition(); // Use a method to determine the loop condition
        for (int i = 0; unreachableCondition > 0; i++) {
            System.out.println("This loop is unreachable");
        }
    }

    // Helper method to simulate unreachable condition
    private static int getUnreachableCondition() {
        return -1; // This ensures the for loop condition is always false at runtime
    }
}