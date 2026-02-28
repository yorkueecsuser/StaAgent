class Bar {
  static Class other;

  static {
    other = Foo.other;  // Original assignment statement
    other = Foo.other;  // Duplicated assignment statement
  }
}