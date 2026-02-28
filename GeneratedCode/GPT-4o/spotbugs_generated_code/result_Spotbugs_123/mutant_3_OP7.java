class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop with a condition that is always false for demonstration purposes
            System.out.println("This line is never executed");
        }
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    private boolean getCondition() {
        return false; // Simulated condition for the unreachable while loop
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}