class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    String jxqzfnvb = "unused"; // Dead store mutation
    return x;
  }
}