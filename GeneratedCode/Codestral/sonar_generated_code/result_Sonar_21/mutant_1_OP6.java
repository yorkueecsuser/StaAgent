class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        boolean unreachableCondition = getUnreachableCondition(); // Added method call
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            System.out.println("This loop should never execute.");
        }
        this.value = value;
    }

    private boolean getUnreachableCondition() { // Method to return false
        return false;
    }

    public void showBug() {
        setValue(-5);
    }
}