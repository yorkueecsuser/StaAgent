class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case in f method");
        break;
    }
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case in g method");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}