class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        value++; // BUG: Side effect in assertion
    }

    public void showBug() {
        incrementValue();
        assert value == 0; // Intentionally kept the bug here

        // Mutated code: Unreachable switch statement
        int val = getValue();
        switch (val) {
            case 1:
                System.out.println("Unreachable code!");
                break;
            default:
                break;
        }
    }

    public int getValueForSwitch() {
        return -1; // Always return a value that does not match any case
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue()); // Value will not be 0 as expected
    }
}