class InfiniteRecursiveLoop {
  int x, y;

  InfiniteRecursiveLoop(int x, y) {
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    InfiniteRecursiveLoop c = new InfiniteRecursiveLoop(x, y);
  }

  static int more() {
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return 1 + more();
  }

  int muchMore() {
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return 2 + muchMore();
  }

  @Override
  public boolean equals(Object o) {
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return equals(o);
  }

  @Override
  public int hashCode() {
    int i = System.identityHashCode(this);
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }

    return i + hashCode();
  }

  private boolean getCondition() {
    return false;
  }
}