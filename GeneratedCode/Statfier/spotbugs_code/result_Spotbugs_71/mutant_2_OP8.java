class Bug1871051 {
  @Override
  public Object clone() {
    return new Bug1871051();
  }

  // Mutated code
  private int a;
  private String b;

  public void someMethod() {
    int c = 10;
    String d = "test";
    a = c;
    b = d;
  }
}