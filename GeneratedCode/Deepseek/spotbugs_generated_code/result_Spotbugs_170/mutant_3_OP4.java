class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        value++; // BUG: Side effect in assertion
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        incrementValue(); // Invoking method with side effect in assertion
        assert value == 0; // Intentionally kept the bug here

        // Unreachable if-else statement mutation
        if (getCondition()) {
            // This branch is unreachable
            System.out.println("This line should never be executed.");
        } else {
            // This else branch is also unreachable, for demonstration purposes
            int x = 10 / 0; // This will throw an ArithmeticException
        }
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue()); // Value will not be 0 as expected
    }
}