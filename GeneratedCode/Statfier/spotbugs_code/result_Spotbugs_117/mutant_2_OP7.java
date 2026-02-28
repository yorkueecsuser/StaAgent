class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("Unreachable loop in doNotReport");
    }
    
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {
    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("Unreachable loop in throwNullValueReport");
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("Unreachable loop in throwPossiblyNullReport");
    }

    throw t;
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}