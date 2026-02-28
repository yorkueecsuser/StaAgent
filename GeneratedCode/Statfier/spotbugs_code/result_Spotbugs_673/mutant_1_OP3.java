class Bug2437445 {

  public static int foo(Object x) {
    int h = x.hashCode();
    if (x == null) return 0;

    // Introduced unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      h = -1;
    }

    return h;
  }

  private static boolean getUnreachableCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}