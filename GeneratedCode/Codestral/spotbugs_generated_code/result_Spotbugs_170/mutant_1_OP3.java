class AssertionSideEffect {
    private int value = 0;

    public int getValue() {
        return value;
    }

    // Adding unreachable if statement mutant
    private boolean getUnreachableCondition() {
        return false;
    }

    public void incrementValue() {
        value++;
        if (getUnreachableCondition()) {
            // This block is unreachable
            System.out.println("Unreachable code block");
        }
    }

    public void showBug() {
        incrementValue();
        assert value == 0;
    }

    public static void main(String[] args) {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        System.out.println("Value after showBug: " + example.getValue());
    }
}