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

        // Inserted unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("Unreachable for loop executed!");
        }

        // BUG: MissingTestCall - forgot to call `testEquals()`
    }

    // Method to simulate dynamic condition
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        stringBug();
    }
}