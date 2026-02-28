class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();
    
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        h += 100;
        break;
    }

    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return -1;
    }

    return x.hashCode();
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always false
    return false;
  }
}