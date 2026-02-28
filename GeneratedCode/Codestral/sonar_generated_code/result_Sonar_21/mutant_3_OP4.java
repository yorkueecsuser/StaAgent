class MethodExceptionBug {
    private int value;

    // Method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        // Inserting unreachable if-else statement
        if (getUnreachableCondition()) {
            // This block is unreachable
            System.out.println("This line should never be executed.");
        } else {
            this.value = value;
        }
    }

    public void showBug() {
        setValue(-5);
    }
}