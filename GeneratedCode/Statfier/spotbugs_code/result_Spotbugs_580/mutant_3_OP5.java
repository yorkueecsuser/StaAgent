class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2: // This case will never be reached because condition? 1 : 0 can only be 0 or 1
        int unusedVar = 42;
        break;
    }

    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    return h;
  }

  public static int foo(Object x) {
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2: // This case will never be reached because condition? 1 : 0 can only be 0 or 1
        int unusedVar = 42;
        break;
    }

    if (x == null) System.out.println("null");

    return x.hashCode();
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}