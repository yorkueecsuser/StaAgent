class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      x = "unreachable";
    }
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      z = "unreachable";
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if branches unreachable
  }
}