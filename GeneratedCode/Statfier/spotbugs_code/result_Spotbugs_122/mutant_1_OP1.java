class Bar {
  static Class other;

  static {
    other = Foo.other;
    // Dead Store mutation
    String qzjxrtkp = "unusedVariable";
  }
}