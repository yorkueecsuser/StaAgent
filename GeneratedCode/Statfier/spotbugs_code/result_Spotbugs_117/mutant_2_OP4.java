class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code");
    } else {
      System.out.println("This is unreachable code due to shouldRun being false");
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This is reachable code");
    } else {
      System.out.println("This is unreachable code due to shouldRun being false");
    }

    throw t;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the else branch is unreachable, but the condition is not a compile-time constant
  }
}