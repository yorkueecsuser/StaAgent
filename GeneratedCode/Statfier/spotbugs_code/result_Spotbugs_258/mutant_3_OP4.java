class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, int y) {
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      x = x + 1;
    } else {
      // This block will never execute because getCondition() returns false
      y = y + 1;
    }

    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      return 2 + more();
    } else {
      // This block will never execute because getCondition() returns false
      return 3 + more();
    }

    return 1 + more();
  }

  int muchMore() {
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      return 3 + muchMore();
    } else {
      // This block will never execute because getCondition() returns false
      return 4 + muchMore();
    }

    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      return true;
    } else {
      // This block will never execute because getCondition() returns false
      return false;
    }

    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() returns false
      return i + 1;
    } else {
      // This block will never execute because getCondition() returns false
      return i + 2;
    }

    return i + hashCode();
  }

  // Helper method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}