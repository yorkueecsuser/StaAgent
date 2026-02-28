class NonsensicalSelfComputationBug {
    private int value;
    private boolean unreachableCondition() {
        return false; // Always returns false to create an unreachable condition
    }

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        if (unreachableCondition()) {
            // Unreachable if block inserted based on the mutation operator information
            System.out.println("This line should never be executed.");
        }
        return value & value;
    }
}