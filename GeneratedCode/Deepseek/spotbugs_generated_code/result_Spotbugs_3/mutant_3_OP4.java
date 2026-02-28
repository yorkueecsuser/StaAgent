class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
        if (checkFalseCondition()) {
            // This branch is unreachable due to checkFalseCondition() always returning false.
            // It's added to demonstrate the mutation operator.
            System.out.println("This line will never be executed.");
        } else {
            // This else branch will always be executed.
            // We still include it to avoid compile-time errors.
            // No changes are made to this branch to maintain the original bug.
        }
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }

    private boolean checkFalseCondition() {
        return false; // This method always returns false, making the if branch unreachable.
    }
}