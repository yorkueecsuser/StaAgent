class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    public void stringBug() {
        // Added unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never be executed as the condition is always false
        }

        new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"))
          .addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall - forgot to call `testEquals()`
    }

    // Method to return a false condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        stringBug();
    }
}