class HandleAssert {

  int f(int x) {
    Object y = null;
    boolean conditionFor = getCondition();
    if (x == 1) {
      y = new String("one");
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    } else if (x == 2) {
      y = Boolean.TRUE;
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    } else {
      assert false;
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
    return y.hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}