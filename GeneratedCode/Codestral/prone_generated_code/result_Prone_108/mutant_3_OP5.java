class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void stringBug() {
        new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"))
          .addEqualityGroup(2, Integer.valueOf(2));

        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            int value = 1;
            switch (value) {
                case 0:
                    System.out.println("This line should never be executed");
                    break;
            }
        }
        // BUG: MissingTestCall - forgot to call `testEquals()`
    }

    public void showBug() {
        stringBug();
    }
}