class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
        // MUTANT CODE
        this.value = value; // Duplicated assignment statement
    }

    public void showBug() {
        setValue(-5);
    }
}