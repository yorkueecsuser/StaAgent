class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    public void stringBug() {
        if (getCondition()) { // Unreachable if statement
            new EqualsTester()
              .addEqualityGroup("hello", new String("hello"))
              .addEqualityGroup("world", new String("world"))
              .addEqualityGroup(2, Integer.valueOf(2));
        }
        // BUG: MissingTestCall - forgot to call `testEquals()`
    }

    public void showBug() {
        stringBug();
    }

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}