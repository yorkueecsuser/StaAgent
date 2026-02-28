class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        boolean condition = getFalseCondition();
        for (int i = 0; condition; i++) {
            // Unreachable for loop
        }
        this.value = value;
    }

    public void showBug() {
        setValue(-5);
    }

    private boolean getFalseCondition() {
        return false;
    }
}