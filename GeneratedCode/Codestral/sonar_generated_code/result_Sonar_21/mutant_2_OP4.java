class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;

        // Mutant added
        if (isUnreachable()) {
            System.out.println("This line is unreachable");
        } else {
            System.out.println("This line is reachable");
        }
    }

    public void showBug() {
        setValue(-5);
    }

    private boolean isUnreachable() {
        // This method is always returning false to make the if-else statement unreachable
        return false;
    }
}