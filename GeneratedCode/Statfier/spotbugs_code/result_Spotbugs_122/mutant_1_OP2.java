class Bar {
  static Class other;

  static {
    other = Foo.other;
    other = Foo.other; // Duplicate assignment statement
  }
}