class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        // Unreachable switch statement
        int value = 0;
        switch(value) {
            case 1:
                System.out.println("This line will never be executed");
                break;
        }

        return nonNullField; // Still returning nonNullField without initializing it, demonstrating the bug
    }
}