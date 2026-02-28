class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    private boolean getUnreachableCondition() {
        // Method to return a condition that is always false
        return false;
    }

    public void stringBug() {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable loop as the condition is always false
            System.out.println("This line will never execute");
        }

        new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"))
          .addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall - forgot to call `testEquals()`
    }

    public void showBug() {
        stringBug();
    }
}