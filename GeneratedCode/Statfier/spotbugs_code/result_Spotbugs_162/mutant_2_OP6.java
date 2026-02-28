class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}