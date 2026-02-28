class DoubleBug {
    public double showBug(int value) {
        boolean unreachableCondition = shouldLoop();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable code
        }
        return Double.longBitsToDouble(value);
    }

    private boolean shouldLoop() {
        // Example of a method that returns a false condition
        return false;
    }
}