class Bug1871051 {
  private int id;

  @Override
  public Object clone() {
    id = 42; // Introduced assignment statement
    id = 42; // Duplicated assignment statement
    return new Bug1871051();
  }
}