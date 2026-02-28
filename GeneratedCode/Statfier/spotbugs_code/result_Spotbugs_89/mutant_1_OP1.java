class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    String qzjfnrht = "unused"; // Dead store
    return x;
  }
}