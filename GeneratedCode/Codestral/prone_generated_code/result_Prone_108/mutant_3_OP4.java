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

        // BUG: MissingTestCall - forgot to call `testEquals()`
        // Mutation Operator: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch should be executed.");
        }
    }

    public void showBug() {
        stringBug();
    }
}