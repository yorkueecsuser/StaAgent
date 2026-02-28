class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        boolean unreachable = false;
        for (; unreachable; ) {
            // Unreachable loop inserted here
        }
        return value & value;
    }
}