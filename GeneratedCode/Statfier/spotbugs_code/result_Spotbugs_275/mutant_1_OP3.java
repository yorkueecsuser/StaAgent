class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      y = new Integer(42); // This line is unreachable
    }

    return y.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}