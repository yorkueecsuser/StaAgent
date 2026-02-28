class BadCompareTo implements Comparable<BadCompareTo> {
  int x;

  @Override
  public int compareTo(BadCompareTo b) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in BadCompareTo");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in BadCompareTo");
    }
    return x - b.x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}

class GoodCompareTo {
  int x;

  public int compareTo(GoodCompareTo g) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in GoodCompareTo");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in GoodCompareTo");
    }
    return x - g.x;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}