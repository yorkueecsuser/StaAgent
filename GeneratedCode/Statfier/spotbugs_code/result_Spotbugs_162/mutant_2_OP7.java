class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in method f");
    }
    y = Integer.toString(i);
  }

  public void g(long i, String x, String y, String z) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable while loop in method g");
    }
    y = Long.toString(i);
  }

  private boolean getCondition() {
    return false;
  }
}