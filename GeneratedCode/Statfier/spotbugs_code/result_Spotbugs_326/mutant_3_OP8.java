public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    return f == foo.f;
  }

  // Mutated code with renaming of variable 'f' to 'g'
  int g;

  // Mutated method with renaming of parameter 'foo' to 'bar'
  public boolean equalsMutant(Bug1619879 bar) {
    return g == bar.g;
  }
}