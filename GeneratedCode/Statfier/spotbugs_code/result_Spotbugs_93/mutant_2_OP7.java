class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x - b.x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x - g.x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}