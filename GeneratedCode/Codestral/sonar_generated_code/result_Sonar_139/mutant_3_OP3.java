class DoubleBug {
    public double showBug(int value) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed!");
        }

        // Original code
        return Double.longBitsToDouble((long) value);
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}