class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        int xyzdead; // Dead Store: Unused variable declaration

        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;
    }

    public void showBug() {
        setValue(-5);
    }
}