class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        value++; // BUG: Side effect in assertion
    }

    public void showBug() {
        incrementValue(); // Invoking method with side effect in assertion
        switch(getValue()) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable Case");
                break;
        }
        assert value == 0; // Intentionally kept the bug here
    }

    // Other methods and main method
}