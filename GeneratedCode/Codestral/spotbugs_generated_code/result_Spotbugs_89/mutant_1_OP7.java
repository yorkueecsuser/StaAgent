class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        // Original code with the bug
        int result = value & value;

        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This loop will never execute because conditionWhile is always false
            System.out.println("Unreachable loop executed!");
        }

        return result;
    }
}