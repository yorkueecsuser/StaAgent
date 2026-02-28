class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      h -= x.hashCode();
    }

    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      x = new Object();
    }

    return x.hashCode();
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}