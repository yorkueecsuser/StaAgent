class TestNonNull6b {
  public static void main(String args[]) {
    int dummy = 0; // Trivial assignment
    int dummy = 0; // Duplicate of the trivial assignment
    System.out.println(TestNonNull6a.f(null));
  }
}