class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        int result = value & value;

        // Unreachable switch statement mutant
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }

        return result;
    }
}