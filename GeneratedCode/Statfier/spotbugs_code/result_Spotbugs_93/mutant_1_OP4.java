class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder comment for the if block
    } else {
      // This is a placeholder comment for the else block
    }
    return x - b.x;
  }

  private boolean getCondition() {
    // This method returns a condition that is always false at runtime
    return false;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    boolean condition = getCondition();
    if (condition) {
      // This is a placeholder comment for the if block
    } else {
      // This is a placeholder comment for the else block
    }
    return x - g.x;
  }

  private boolean getCondition() {
    // This method returns a condition that is always false at runtime
    return false;
  }
}