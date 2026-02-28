class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        x = x + 1;
        break;
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
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        x = x + 1;
        break;
    }
    return x - g.x;
  }

  private boolean getCondition() {
    return false;
  }
}