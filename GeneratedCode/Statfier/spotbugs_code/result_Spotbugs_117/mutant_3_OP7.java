class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }

    if (t!= null) {
      System.out.println("ok");
    }

    throw t;
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the loops are unreachable
  }
}