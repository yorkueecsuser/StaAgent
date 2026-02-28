class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        while (!isValidValue(value)) { // Unreachable while loop
            // This block will never be executed
        }
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
    }

    public boolean isValidValue(int value) {
        return false; // Always returns false to make the while loop unreachable
    }

    public void showBug() {
        setValue(-5);
    }
}