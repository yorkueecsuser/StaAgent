class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      x = x + 1;
    }
    return x - b.x;
  }

  private boolean getCondition() {
    return false;
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      x = x + 1;
    }
    return x - g.x;
  }

  private boolean getCondition() {
    return false;
  }
}