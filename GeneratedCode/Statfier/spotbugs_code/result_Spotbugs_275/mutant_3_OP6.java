class HandleAssert {

  int f(int x) {
    Object y = null;
    boolean conditionFor = getConditionForLoop();
    
    // Unreachable for loop
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }

    if (x == 1) y = new String("one");
    else if (x == 2) y = Boolean.TRUE;
    else {
      assert false;
    }
    return y.hashCode();
  }

  private boolean getConditionForLoop() {
    return false;
  }
}