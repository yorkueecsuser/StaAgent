class EqualsTesterBug {
    private static class EqualsTester {
        public EqualsTester addEqualityGroup(Object... objects) {
            return this;
        }
    }

    public void stringBug() {
        EqualsTester tester = new EqualsTester()
          .addEqualityGroup("hello", new String("hello"))
          .addEqualityGroup("world", new String("world"));

        // Mutant: Duplicated assignment statement
        tester.addEqualityGroup("hello", new String("hello"));

        tester.addEqualityGroup(2, Integer.valueOf(2));
    }

    public void showBug() {
        stringBug();
    }
}