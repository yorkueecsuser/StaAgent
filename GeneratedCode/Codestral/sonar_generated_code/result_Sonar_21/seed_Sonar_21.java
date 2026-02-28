class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative"); // BUG: Calls to methods should not trigger an exception
        }
        this.value = value;
    }

    public void showBug() {
        setValue(-5);
    }
}