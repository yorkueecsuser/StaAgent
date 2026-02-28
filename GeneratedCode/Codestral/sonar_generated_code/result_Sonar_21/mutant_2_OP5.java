class MethodExceptionBug {
    private int value;

    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        this.value = value;

        int unreachableValue = -1; // This value will make the switch statement unreachable
        switch(unreachableValue) {
            case 1:
                System.out.println("This case will never be reached");
                break;
            default:
                break;
        }
    }

    public void showBug() {
        setValue(-5);
    }
}