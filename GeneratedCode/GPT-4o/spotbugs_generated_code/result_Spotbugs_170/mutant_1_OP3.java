class AssertionSideEffect {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }

    public boolean isCounterEven() {
        return counter % 2 == 0;
    }

    public boolean showBug() {
        // Unreachable if statement insertion based on mutation operator description.
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable used
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        }

        // This assertion has a side effect because it calls incrementCounter()
        // which changes the state of the object by incrementing the counter.
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        return isCounterEven();
    }
    
    // Helper method to provide a condition for the unreachable if statement
    private boolean getUnreachableCondition() {
        return false; // Always returns false, but dynamically determined at runtime
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println("Counter is even: " + example.showBug());
    }
}