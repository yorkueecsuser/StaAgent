class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;

        // Mutant: Unreachable switch statement
        int switchValue = getUnreachableValue();
        switch (switchValue) {
            case 1:
                System.out.println("This line will never be executed");
                break;
        }
    }

    public int getUnreachableValue() {
        // This method always returns a value that is not 1 to make the switch statement unreachable.
        return -1;
    }

    public void showBug() {
        setValue(-5);
    }
}