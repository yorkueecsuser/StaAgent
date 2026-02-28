class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }

        // Mutated code: Unreachable if statement
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This statement is unreachable");
        }

        this.value = value;
    }

    public void showBug() {
        setValue(-5);
    }

    // Function to return unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}