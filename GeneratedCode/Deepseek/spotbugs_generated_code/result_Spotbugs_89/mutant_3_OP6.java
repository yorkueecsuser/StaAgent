class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This line should never execute.");
        }

        // Original bug: Nonsensical self computation involving a field
        return value & value;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}