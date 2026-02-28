class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }

    // Introduced unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      y = new Integer(0); // This branch is unreachable
    } else {
      y = new Double(0.0); // This branch is also unreachable
    }

    return y.hashCode();
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if-else block unreachable
  }
}