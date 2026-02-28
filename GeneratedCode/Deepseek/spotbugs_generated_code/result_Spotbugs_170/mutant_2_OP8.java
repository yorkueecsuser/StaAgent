class AssertionSideEffect {
    private int val = 0; // Renamed 'value' to 'val'

    public int getValue() {
        return val; // Updated the method to use the renamed variable
    }

    public void incrementValue() {
        val++; // BUG: Side effect in assertion
    }

    public void showBug() {
        incrementValue(); // Invoking method with side effect in assertion
        assert val == 0; // Intentionally kept the bug here
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue()); // Updated the print statement to use the renamed variable
    }
}