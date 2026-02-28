class AssertionSideEffect {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }

    public boolean isCounterEven() {
        return counter % 2 == 0;
    }
    
    private boolean getFalseCondition() {
        return counter < 0; // This will always be false as counter starts from 0 and increments.
    }

    public boolean showBug() {
        // This assertion has a side effect because it calls incrementCounter()
        // which changes the state of the object by incrementing the counter.
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)

        // Unreachable if statement inserted here
        if (getFalseCondition()) {
            System.out.println("This block is unreachable");
        }

        return isCounterEven();
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println("Counter is even: " + example.showBug());
    }
}