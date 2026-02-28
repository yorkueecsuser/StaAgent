class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        if (getValue() == 0) { // Unreachable if statement
            // This if block will never be executed since getValue() cannot return 0
            throw new RuntimeException("This is an unreachable statement");
        }
        return value & value;
    }

    private int getValue() {
        return value;
    }
}