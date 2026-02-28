class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, y) {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        x = 10;
        break;
    }

    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        return 0;
    }
    return 1 + more();
  }

  int muchMore() {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        y = 20;
        break;
    }
    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        return true;
    }
    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 1 : 0) {
      case 2:
        // This case is unreachable because condition? 1 : 0 will never be 2
        return 0;
    }
    return i + hashCode();
  }

  private boolean getCondition() {
    // This method returns a condition that ensures the switch statement is unreachable
    return false;
  }
}