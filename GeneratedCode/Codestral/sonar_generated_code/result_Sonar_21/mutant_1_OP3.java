class MethodExceptionBug {
    private int value;
    private boolean getUnreachableCondition() {
        return false;
    }

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This code will never be executed");
        }
    }

    public void showBug() {
        setValue(-5);
    }
}