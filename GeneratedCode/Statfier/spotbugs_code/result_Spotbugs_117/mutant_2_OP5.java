class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("Unreachable case 1");
        break;
      case false:
        System.out.println("Unreachable case 2");
        break;
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("Unreachable case 3");
        break;
      case false:
        System.out.println("Unreachable case 4");
        break;
    }

    throw t;
  }

  // Method to provide dynamic condition for switch statement
  private boolean getCondition() {
    return false; // This will ensure the switch is unreachable but not due to a compile-time constant
  }
}