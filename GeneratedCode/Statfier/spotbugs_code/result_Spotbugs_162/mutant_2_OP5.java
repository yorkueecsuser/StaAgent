class OverwrittenParameter {

  public void f(int i, String x, String y, String z) {
    y = Integer.toString(i);
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in method f");
        break;
    }
  }

  public void g(long i, String x, String y, String z) {
    y = Long.toString(i);
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in method g");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}