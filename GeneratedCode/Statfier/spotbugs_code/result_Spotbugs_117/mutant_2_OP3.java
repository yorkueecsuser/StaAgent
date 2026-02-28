class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement");
    }

    throw t;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}