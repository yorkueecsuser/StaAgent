class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        // Mutant added here
        boolean isUnreachable = getCondition();
        while (isUnreachable) {
            System.out.println("This is an unreachable while loop.");
        }
        this.value = value;
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        setValue(-5);
    }
}