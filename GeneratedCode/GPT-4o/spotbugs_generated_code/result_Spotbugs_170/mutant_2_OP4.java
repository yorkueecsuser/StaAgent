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

        // Mutation: Inserting an unreachable if-else branch
        boolean unreachableCondition = counter < 0; // This condition is always false because counter is never negative in this context
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Proceeding with the original logic.");
        }

        return isCounterEven();
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println("Counter is even: " + example.showBug());
    }
}