class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public void stringBug() {
        new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"))
          .addEqualityGroup(2, Integer.valueOf(2));

        // Unreachable if-else statement mutant
        if (getFalseCondition()) {
            System.out.println("This code will never execute.");
        } else {
            // Original code continues here
        }

        // BUG: MissingTestCall - forgot to call `testEquals()`
    }

    public void showBug() {
        stringBug();
    }
}