class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    public void stringBug() {
        new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"))
          .addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall - forgot to call `testEquals()`

        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public void showBug() {
        stringBug();
    }
}