class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    // Dead store mutation
    String abcdefgh = "unusedVariable";
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    // Dead store mutation
    int ijklmnop = 42;
  }
}