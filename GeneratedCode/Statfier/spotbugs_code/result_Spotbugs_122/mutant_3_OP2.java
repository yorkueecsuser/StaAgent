class Bar {
  static Class other;

  static {
    other = Foo.other; // Original assignment
    other = Foo.other; // Duplicated assignment
  }
}