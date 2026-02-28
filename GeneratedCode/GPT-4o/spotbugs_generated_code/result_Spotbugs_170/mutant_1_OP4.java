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
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)

        // Unreachable if-else statement mutation
        boolean alwaysFalseCondition = getAlwaysFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block will always execute.");
        }

        return isCounterEven();
    }

    private boolean getAlwaysFalseCondition() {
        return counter < 0; // Since counter is initialized at 0 and incremented, this will always be false.
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println("Counter is even: " + example.showBug());
    }
}