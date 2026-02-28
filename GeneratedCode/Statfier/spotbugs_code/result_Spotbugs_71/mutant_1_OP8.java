class Bug1871051 {
  @Override
  public Object clone() {
    return new Bug1871051();
  }

  // Mutated code
  private void someMethod() {
    int a = 5;
    int b = 10;
    int c = a + b;
  }
}