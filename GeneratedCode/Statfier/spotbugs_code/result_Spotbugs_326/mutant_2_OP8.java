public enum Bug1619879 {
  ONE,
  TWO;

  int f;

  // should report something other than EQ_SELF_NO_OBJECT
  public boolean equals(Bug1619879 foo) {
    return f == foo.f;
  }

  // Mutated code with renaming operator
  int a;

  // Mutated method with renamed variable
  public boolean equals(Bug1619879 bar) {
    return a == bar.a;
  }
}