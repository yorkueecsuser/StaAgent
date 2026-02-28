class DoubleBug {
    private boolean getFalseCondition() {
        // Method to simulate a dynamic false condition
        return false;
    }

    public double showBug(int value) {
        if (getFalseCondition()) {
            // Mutant: Unreachable if-else statement
            System.out.println("This branch should never be executed.");
        } else {
            // Original code
            return Double.longBitsToDouble((long) value);
        }
    }
}