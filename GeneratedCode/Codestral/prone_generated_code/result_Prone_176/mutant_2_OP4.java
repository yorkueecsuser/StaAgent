class XorPowerBug {
    public int showBug(int base, int exponent) {
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            // Unreachable if-else statement mutation
            System.out.println("This line should never be executed.");
        } else {
            // Original code
            return base ^ exponent;
        }
    }

    private boolean falseMethod() {
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }
}