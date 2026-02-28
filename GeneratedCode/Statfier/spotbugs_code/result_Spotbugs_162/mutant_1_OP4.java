class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // Alternative code that will also never execute
    }
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // Alternative code that will also never execute
    }
  }

  private boolean getCondition() {
    return false;
  }
}