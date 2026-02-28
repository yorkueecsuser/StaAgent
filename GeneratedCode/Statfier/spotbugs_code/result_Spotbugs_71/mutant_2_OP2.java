class Bug1871051 {
  @Override
  public Object clone() {
    return new Bug1871051();
    return new Bug1871051(); // Mutant: duplicated return statement
  }
}