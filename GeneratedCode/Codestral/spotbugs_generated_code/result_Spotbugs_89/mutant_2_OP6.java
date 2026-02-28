class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        // Inserted unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This loop is unreachable.");
        }

        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    }
}