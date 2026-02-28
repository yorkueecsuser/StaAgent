class NonNullFieldBug {
    // @Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
        unreachableForLoop();
    }

    private void unreachableForLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("Unreachable code");
        }
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}