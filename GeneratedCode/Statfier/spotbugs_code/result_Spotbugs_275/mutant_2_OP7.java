class HandleAssert {

  int f(int x) {
    Object y = null;
    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will never be true at runtime
    }
    
    return y.hashCode();
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}