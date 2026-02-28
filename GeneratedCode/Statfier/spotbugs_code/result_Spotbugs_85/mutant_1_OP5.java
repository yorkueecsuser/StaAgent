class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();

    // Inserted unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  @Override
  protected void finalize() {
    System.gc();

    // Inserted unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  public void bad() {
    System.gc();

    // Inserted unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
    }

    // Inserted unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  public void tricky() {
    try {
      System.out.println("tricky()");
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }

    System.gc();

    // Inserted unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
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

    // Inserted unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        System.out.println("Unreachable case");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}