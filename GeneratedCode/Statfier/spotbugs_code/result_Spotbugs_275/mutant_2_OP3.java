class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }

    // Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      y = new Integer(0); // This line is unreachable because condition is always false
    }

    return y.hashCode();
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false at runtime
  }
}