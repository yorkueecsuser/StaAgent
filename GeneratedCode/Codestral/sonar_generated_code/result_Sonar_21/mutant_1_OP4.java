class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            if (value < 0) {
                throw new IllegalArgumentException("Value must be non-negative");
            }
            this.value = value;
        }
    }

    public void showBug() {
        setValue(-5);
    }
}