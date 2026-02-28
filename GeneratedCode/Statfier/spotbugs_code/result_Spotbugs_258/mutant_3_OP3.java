class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, y) {
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      x = x + 1;
    }

    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return 0;
    }
    return 1 + more();
  }

  int muchMore() {
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      y = y + 2;
    }
    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return true;
    }
    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      return 0;
    }
    return i + hashCode();
  }

  // Helper method to always return false
  private static boolean getCondition() {
    return false;
  }
}