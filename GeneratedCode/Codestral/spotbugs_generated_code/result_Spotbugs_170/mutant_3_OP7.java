class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        value++; // BUG: Side effect in assertion
    }

    public boolean getFalseCondition() {
        return false; // Method to return false condition for while loop
    }

    public void showBug() {
        incrementValue(); // Invoking method with side effect in assertion
        // Added unreachable while loop
        while (getFalseCondition()) {
            System.out.println("Unreachable code");
        }
        assert value == 0; // Intentionally kept the bug here
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue()); // Value will not be 0 as expected
    }
}