class Bar {
  static Class other;

  static {
    other = Foo.other;
  }

  // Mutant code with renaming mutation operator applied
  static Class z;

  static {
    z = Foo.z;
  }
}