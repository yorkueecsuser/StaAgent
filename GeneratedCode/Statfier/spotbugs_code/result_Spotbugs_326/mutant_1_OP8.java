public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    return f == foo.f;
  }

  // Mutated code with renaming operator
  int g; // New variable introduced for mutation

  public boolean equalsMutant(Bug1619879 bar) { // Renamed parameter 'foo' to 'bar'
    return g == bar.g; // Renamed variable 'f' to 'g' in this mutant
  }
}