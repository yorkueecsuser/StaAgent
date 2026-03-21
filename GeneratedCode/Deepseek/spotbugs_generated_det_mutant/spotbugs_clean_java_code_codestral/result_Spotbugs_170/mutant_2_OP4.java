class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        value++; // BUG: Side effect in assertion
    }

    public void showBug() {
        boolean condition = false; // Making the condition always false
        if (condition) {
            incrementValue(); // Unreachable side effect
        } else {
            // This else block is always executed
        }
        incrementValue(); // Original side effect method
        assert value == 0; // Intentionally kept the bug here
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue()); // Value will not be 0 as expected
    }
}