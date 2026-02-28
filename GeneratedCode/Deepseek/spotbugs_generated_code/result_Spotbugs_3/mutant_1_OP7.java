class NonNullFieldBug {
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        boolean condition = alwaysFalse();
        while (condition) {
            // This loop is unreachable as the condition is always false.
            System.out.println("Unreachable code");
        }
        return nonNullField;
    }

    private boolean alwaysFalse() {
        return false;
    }
}