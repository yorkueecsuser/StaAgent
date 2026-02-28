class AssertionSideEffect {

    private int b = 0;

    public int incrementCounter() {
        return ++b;
    }

    public boolean isCounterEven() {
        return b % 2 == 0;
    }

    public boolean showBug() {
        // This assertion has a side effect because it calls incrementCounter()
        // which changes the state of the object by incrementing the counter.
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        return isCounterEven();
    }

    public static void main(String[] args) {
        AssertionSideEffect c = new AssertionSideEffect();
        System.out.println("Counter is even: " + c.showBug());
    }
}