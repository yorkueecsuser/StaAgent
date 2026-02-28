class Ideas_2009_01_15 {

  public static int foo(Object x, Object y) {
    if (y == null) y = x;
    int h = x.hashCode();

    if (y!= null) h += y.hashCode();

    h += y.hashCode();

    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      h -= x.hashCode();
    } else {
      // This block will always execute
      h += 1;
    }

    return h;
  }

  public static int foo(Object x) {

    if (x == null) System.out.println("null");

    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block should never execute
      return 0;
    } else {
      // This block will always execute
      return x.hashCode();
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, making the if branch unreachable
  }
}