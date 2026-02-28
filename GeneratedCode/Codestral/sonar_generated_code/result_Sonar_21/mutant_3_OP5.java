class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative"); // BUG: Calls to methods should not trigger an exception
        }

        // Mutant code: Unreachable switch statement
        boolean shouldRunSwitch = false;
        if (shouldRunSwitch) {
            switch (value) {
                case 1:
                    System.out.println("This should not be printed");
                    break;
            }
        }

        this.value = value;
    }

    public void showBug() {
        setValue(-5);
    }
}