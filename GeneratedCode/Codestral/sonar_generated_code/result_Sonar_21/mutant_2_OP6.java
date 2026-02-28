class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        boolean conditionFor = false; // This condition is always false to make the loop unreachable
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
        }
        this.value = value;
    }

    public void showBug() {
        setValue(-5);
    }
}