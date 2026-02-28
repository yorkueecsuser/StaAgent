class AssertionSideEffect {

    private int x = 0; // Renamed from counter

    public int incrementCounter() {
        return ++x; // Updated to use the renamed variable
    }

    public boolean isCounterEven() {
        return x % 2 == 0; // Updated to use the renamed variable
    }

    public boolean showBug() {
        // This assertion has a side effect because it calls incrementCounter()
        // which changes the state of the object by incrementing the counter.
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        return isCounterEven();
    }

    public static void main(String[] args) {
        AssertionSideEffect y = new AssertionSideEffect(); // Renamed from example
        System.out.println("Counter is even: " + y.showBug()); // Updated to use the renamed variable
    }
}