class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        // Original bug
        int buggyResult = value & value;

        // Mutant: Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This code block is unreachable
            System.out.println("Unreachable while loop executed.");
        }

        return buggyResult;
    }
}