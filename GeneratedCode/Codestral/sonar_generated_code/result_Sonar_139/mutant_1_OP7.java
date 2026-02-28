class DoubleBug {
    private boolean getFalseCondition() {
        return false;
    }

    public double showBug(int value) {
        // Inserted unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This is an unreachable loop");
        }

        // Original code
        return Double.longBitsToDouble((long) value); // Compliant
    }
}