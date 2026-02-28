class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        // Unreachable while loop mutation
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This is unreachable code inside a while loop.");
        }
        
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}