class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Another unreachable code
    }
  }

  @Override
  protected void finalize() {
    System.gc();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Another unreachable code
    }
  }

  public void bad() {
    System.gc();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Another unreachable code
    }
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
    }
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Another unreachable code
    }
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Another unreachable code
    }
  }

  public void tricky2() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    for (int i = 0; i < 20; i++) System.out.println(i);
    System.gc();
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
    } else {
      // Another unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}