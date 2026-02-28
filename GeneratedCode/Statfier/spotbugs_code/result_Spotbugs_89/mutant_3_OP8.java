class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    return x;
  }

  public int bar() {
    int y = 3;
    y = y;
    return y;
  }
}