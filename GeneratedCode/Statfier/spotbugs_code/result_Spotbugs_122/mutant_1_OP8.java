class Bar {
  static Class other;

  static {
    other = Foo.other;
  }

  // Mutant code
  static Class x;

  static {
    x = Foo.x;
  }
}