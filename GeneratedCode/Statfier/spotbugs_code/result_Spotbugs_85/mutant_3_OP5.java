class InvokeGC {
  public static void main(String[] argv) {
    System.gc();
    System.currentTimeMillis();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  @Override
  protected void finalize() {
    System.gc();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void bad() {
    System.gc();

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void ok() {
    try {
      System.out.println("ok()");
    } catch (OutOfMemoryError e) {
      System.gc();
    }

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}