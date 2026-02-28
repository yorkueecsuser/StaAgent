class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
        this.value = value; // Mutant: Duplicate assignment
    }

    public void showBug() {
        setValue(-5);
    }
}