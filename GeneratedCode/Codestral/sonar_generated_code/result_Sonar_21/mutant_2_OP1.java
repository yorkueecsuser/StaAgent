class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
    }

    public void showBug() {
        int deadStore = 10;  // dead store mutation
        setValue(-5);
    }
}