class DoubleBug {
    private boolean alwaysFalse() {
        return false;
    }

    public double showBug(int value) {
        if (alwaysFalse()) { // Mutant: Unreachable if statement
            throw new RuntimeException("This code should never execute");
        }

        // Original code
        return Double.longBitsToDouble((long) value);
    }
}