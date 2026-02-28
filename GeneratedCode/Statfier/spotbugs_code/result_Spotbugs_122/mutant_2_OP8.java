class Bar {
  static Class other;

  static {
    other = Foo.other;
  }

  // Mutated code with renaming operator
  static Class z;
  
  static {
    z = Foo.z;
  }
}