class CheckATHROW {
  public void doNotReport(Throwable obj) throws Throwable {
    throw obj;
  }

  public void throwNullValueReport(boolean b) throws Throwable {

    Throwable t = null;

    if (b) {
      System.out.println("Yeah");
    }

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This is unreachable code");
    }

    throw t;
  }

  public void throwPossiblyNullReport(Throwable t) throws Throwable {
    if (t!= null) {
      System.out.println("ok");
    }

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This is unreachable code in another method");
    }

    throw t;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}