class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) { // Unreachable if statement
            System.out.println("Unreachable code");
        }
        this.value = value;
    }

    private boolean getCondition() {
        return false; // This method is used to dynamically determine the condition at runtime
    }

    public void showBug() {
        setValue(-5);
    }
}