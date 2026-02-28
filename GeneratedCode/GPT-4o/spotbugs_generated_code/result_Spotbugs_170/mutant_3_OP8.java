class AssertionSideEffect {

    private int a = 0; // Renamed 'counter' to 'a'

    public int incrementCounter() {
        return ++a; // Reflect the renaming in method
    }

    public boolean isCounterEven() {
        return a % 2 == 0; // Reflect the renaming in method
    }

    public boolean showBug() {
        // This assertion has a side effect because it calls incrementCounter()
        // which changes the state of the object by incrementing the counter.
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        return isCounterEven();
    }

    public static void main(String[] args) {
        AssertionSideEffect b = new AssertionSideEffect(); // Renamed 'example' to 'b'
        System.out.println("Counter is even: " + b.showBug());
    }
}