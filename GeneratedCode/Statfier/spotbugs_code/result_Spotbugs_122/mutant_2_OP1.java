class Bar {
  static Class other;

  static {
    other = Foo.other;
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }
}