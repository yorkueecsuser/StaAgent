class TestNonNull6b {
  public static void main(String args[]) {
    String abcdefgh = "unusedVariable"; // Dead store mutation
    System.out.println(TestNonNull6a.f(null));
  }
}