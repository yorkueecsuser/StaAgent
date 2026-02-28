class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x; // Original assignment
    x = x; // Duplicated assignment
    return x;
  }
}