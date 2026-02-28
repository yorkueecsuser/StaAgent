class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("Unreachable case");
        break;
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        System.out.println("Another unreachable case");
        break;
    }

    throw t;
  }

  private boolean getCondition() {
    return false; // This method ensures the switch condition is dynamically determined but always false
  }
}