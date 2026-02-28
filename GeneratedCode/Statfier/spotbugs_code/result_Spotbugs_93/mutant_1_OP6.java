class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return x - b.x;
  }

  private boolean getCondition() {
    return false; // This ensures the loop is unreachable but not a compile-time constant
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return x - g.x;
  }

  private boolean getCondition() {
    return false; // This ensures the loop is unreachable but not a compile-time constant
  }
}