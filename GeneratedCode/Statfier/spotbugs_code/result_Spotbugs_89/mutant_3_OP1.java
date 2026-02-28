class SelfAssignment {
  public int foo() {
    int x = 3;
    x = x;
    String qzjfnxmk = "unused"; // Dead store
    return x;
  }
}