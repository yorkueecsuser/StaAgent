class AssertionSideEffect {

    private int counter = 0;

    public int incrementCounter() {
        return ++counter;
    }

    public boolean isCounterEven() {
        return counter % 2 == 0;
    }

    public boolean showBug() {
        // Adding an unreachable switch statement as a mutant
        int unreachableValue = getUnreachableValue(); // Method to determine value
        switch (unreachableValue) {
            case 1:
                System.out.println("This will not execute");
                break;
            default:
                break;
        }

        // This assertion has a side effect because it calls incrementCounter()
        // which changes the state of the object by incrementing the counter.
        assert incrementCounter() > 0 : "Counter should be positive"; // BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
        return isCounterEven();
    }

    // Method to return a value that makes the switch unreachable
    private int getUnreachableValue() {
        return 0;
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        System.out.println("Counter is even: " + example.showBug());
    }
}