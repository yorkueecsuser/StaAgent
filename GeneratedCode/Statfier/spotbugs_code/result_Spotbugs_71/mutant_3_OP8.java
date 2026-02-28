class Bug1871051 {
  @Override
  public Object clone() {
    return new Bug1871051();
  }

  // Mutated code with renaming operator
  public Object x() {
    return new Bug1871051();
  }
}