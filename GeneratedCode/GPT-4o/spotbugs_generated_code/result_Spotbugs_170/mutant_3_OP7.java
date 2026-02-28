class AssertionSideEffect {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }

    public boolean isCounterEven() {
        return counter % 2 == 0;
    }

    public boolean showBug() {
        // This assertion has a side effect because it calls incrementCounter()
        // which changes the state of the object by incrementing the counter.
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is an unreachable statement inside the while loop.");
        }

        return isCounterEven();
    }

    // Helper method to ensure the loop is unreachable
    private boolean getCondition() {
        return false; // condition is set to false to make the loop unreachable
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println("Counter is even: " + example.showBug());
    }
}