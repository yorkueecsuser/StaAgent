class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // Original bug: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        int result = value & value;

        // Mutation: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code block will never be executed, as the condition is always false
            System.out.println("This code block is unreachable.");
        }

        return result;
    }
}