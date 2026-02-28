class DoubleBug {
    public double showBug(int value) {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This loop is unreachable
            System.out.println("This is an unreachable loop.");
        }

        // Original code
        return Double.longBitsToDouble((long)value); // Compliant - Now correctly takes "long" as argument
    }
}