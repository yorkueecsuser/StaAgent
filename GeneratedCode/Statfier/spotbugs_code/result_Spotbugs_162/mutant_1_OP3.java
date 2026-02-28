class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = "unreachable";
    }
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      z = "unreachable";
    }
  }

  private boolean getCondition() {
    return false;
  }
}