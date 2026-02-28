class Ideas_2011_03_27 implements Comparable<Ideas_2011_03_27> {

  int x;

  public Ideas_2011_03_27(int x) {
    this.x = x;
  }

  @Override
  public int hashCode() {
    return x;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Ideas_2011_03_27)) return false;
    Ideas_2011_03_27 other = (Ideas_2011_03_27) obj;
    return x == other.x;
  }

  /** Bug pattern suggested by Kevin Bourrillion */
  @Override
  public int compareTo(Ideas_2011_03_27 that) {
    if (this.x < that.x) return Integer.MIN_VALUE;
    if (this.x > that.x) return Integer.MAX_VALUE;
    return 0;
  }

  /** Bug pattern suggested by Kevin Bourrillion */
  public int reverseCompareTo(Ideas_2011_03_27 that) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        // This case is unreachable because getValue(condition) will never return 1
        System.out.println("This is unreachable");
        break;
      default:
        // Default case
        break;
    }
    return -this.compareTo(that);
  }

  private boolean getCondition() {
    // This method returns false, ensuring the switch statement remains unreachable
    return false;
  }

  private int getValue(boolean condition) {
    // This method returns 0, ensuring the switch statement remains unreachable
    return condition? 1 : 0;
  }
}