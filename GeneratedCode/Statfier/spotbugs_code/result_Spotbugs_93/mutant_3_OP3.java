class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      System.out.println("This will never be printed");
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
      System.out.println("This will never be printed");
    }
    return x - g.x;
  }

  private boolean getCondition() {
    return false;
  }
}