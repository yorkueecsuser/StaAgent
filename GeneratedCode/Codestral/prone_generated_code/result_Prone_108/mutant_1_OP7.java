class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void stringBug() {
        new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"))
          .addEqualityGroup(2, Integer.valueOf(2));

        // Inserted unreachable while loop
        while (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        }
        // BUG: MissingTestCall - forgot to call `testEquals()`
    }

    public void showBug() {
        stringBug();
    }
}