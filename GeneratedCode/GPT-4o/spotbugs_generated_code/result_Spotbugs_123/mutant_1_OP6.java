class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        // Unreachable for loop insertion
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            // This block will never execute
            System.out.println("This will never print");
        }

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }

    private boolean getLoopCondition() {
        return false; // Ensures the for loop is unreachable
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}