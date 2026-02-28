class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // Unreachable code
                System.out.println("This code will never be executed.");
            } else {
                // Simplified implementation for demonstration purposes
                return this;
            }
        }

        private boolean getUnreachableCondition() {
            return false;
        }

        // Oops: forgot to implement `testEquals()`
    }

    public void stringBug() {
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