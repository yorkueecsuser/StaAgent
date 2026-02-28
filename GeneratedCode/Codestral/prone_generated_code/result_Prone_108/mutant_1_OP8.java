class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            // Simplified implementation for demonstration purposes
            return this;
        }
        // Oops: forgot to implement `testEquals()`
    }

    public void stringBug() {
        EqualsTester g = new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"))
          .addEqualityGroup(2, Integer.valueOf(2));
        // BUG: MissingTestCall - forgot to call `testEquals()`
        // Mutant code: Renamed the variable 'g' to 'h'
        EqualsTester h = g;
        // h.testEquals(); // Uncommented this line to generate a compilation error since 'testEquals()' is not implemented
    }

    public void showBug() {
        stringBug();
    }
}