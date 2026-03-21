class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {
        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as getCondition() is always returning false
            System.out.println("Unreachable loop executed.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}